package task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Skill skill1 = new Skill(Languages.JS.toString(),10);
        Skill skill2 = new Skill(Languages.JAVA.toString(), 10);
        ArrayList<Skill> skills = new ArrayList<>();
        Car car = new Car("golf",2003,75);
        Person person1 = new Person(1,"Max","Fellow","max@gmail.com",20, Gender.MALE.toString(),skills,car);
        person1.addSkils(skill1);
        person1.addSkils(skill2);
        System.out.println(person1.toString());
    }
}
