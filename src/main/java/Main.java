import com.mysql.cj.jdbc.MysqlDataSource;
import enums.Type;
import models.Car;
import models.Word;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
        Metadata metadata = new MetadataSources(serviceRegistry)
                .addAnnotatedClass(Word.class)
                .addAnnotatedClass(Car.class)
                .getMetadataBuilder()
                .build();

        try (
                SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
                Session session = sessionFactory.openSession();
        )
        {
            Transaction transaction = session.beginTransaction();
            Word word1 = new Word();
            Word word2 = new Word();
            Word word3 = new Word();

            word1.setValue("apple");
            word2.setValue("pen");
            word3.setValue("notebook");

            session.save(word1);
            session.save(word2);
            session.save(word3);

            Car car1 = new Car("BMW", Type.SEDAN, 250, 20000, 2010);
            Car car2 = new Car("Volkswagen", Type.UNIVERSAL, 75, 3500, 2003);
            Car car3 = new Car("Honda", Type.HATCHBACK, 120, 10000, 2007);

            session.save(car1);
            session.save(car2);
            session.save(car3);

            List<Word> words = session.createQuery("from Word", Word.class).list();
            System.out.println(words);

            transaction.commit();
        }
    }
}
