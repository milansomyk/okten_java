package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("toyota",250,"Vasya",24,2,20000,2003);
        Car car2 = new Car("volkswagen",120,"Petya",20,3,10000,2010);
        Car car3 = new Car("ford",140,"Loki",19,6,9000,2012);
        Car car4 = new Car("lada",80,"Dominik",23,3,1000,1999);
        Car car5 = new Car("hyundai",95,"Nikita",27,5,5000,2018);
        Car car6 = new Car("chevrolet",100,"Mikola",30,1,14000,2013);
        Car car7 = new Car("skoda",87,"Georgiy",29,2,7000,2007);
        Collections.addAll(cars,car1,car2,car3,car4,car5,car6,car7);
        cars.stream().forEach(car -> {
            if (car.power<100) {
                car.upgradeEngine();
            }
        });
        System.out.println(cars);
        cars.stream().filter(car -> car.owner.experience<5 && car.owner.age>25).forEach(car -> car.owner.improveQualification());
        System.out.println(cars);
        int priceAll = cars.stream().map(car -> car.price).reduce(0,(a,b)->a+b);
        System.out.println(priceAll);
    }
}
