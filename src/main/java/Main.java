import enums.Type;
import models.Car;
import models.DriveLicense;
import models.Owner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
        Metadata metadata = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(Owner.class)
                .addAnnotatedClass(DriveLicense.class)
                .getMetadataBuilder()
                .build();

        try (
                SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
                Session session = sessionFactory.openSession()
        )
        {
            Transaction transaction = session.beginTransaction();

            Car car1 = new Car("BMW", Type.SEDAN, 250, 20000, 2010);
            Car car2 = new Car("Volkswagen", Type.UNIVERSAL, 75, 3500, 2003);
            Car car3 = new Car("Honda", Type.HATCHBACK, 120, 10000, 2007);
            Car car4 = new Car("Toyota", Type.HATCHBACK, 105, 7500, 2010);
            Car car5 = new Car("Mazda", Type.SEDAN, 150, 5500, 2004);


            DriveLicense driveLicense1 = new DriveLicense(81652);
            DriveLicense driveLicense2 = new DriveLicense(34612);
            DriveLicense driveLicense3 = new DriveLicense(78623);


            Owner owner1 = new Owner(1, "John");
            Owner owner2 = new Owner(1, "Mike");
            Owner owner3 = new Owner(1, "Alex");

            owner1.setDriveLicense(driveLicense1);
            owner2.setDriveLicense(driveLicense2);
            owner3.setDriveLicense(driveLicense3);

            owner1.setCars(Arrays.asList(car1,car2));
            owner2.setCars(Arrays.asList(car3));
            owner3.setCars(Arrays.asList(car4,car5));

            session.save(owner1);
            session.save(owner2);
            session.save(owner3);
            transaction.commit();
        }
    }
}
