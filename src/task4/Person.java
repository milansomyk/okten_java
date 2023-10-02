package task4;

import java.util.ArrayList;

public class Person {
    int id;
    String name;
    String surname;
    String email;
    int age;
    String gender;
    ArrayList<Skill> skills;
    Car car;

    public void addSkils(Skill skill){
        skills.add(skill);
    }

    public Person(int id, String name, String surname, String email, int age, String gender, ArrayList<Skill> skills, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", skills=" + skills.toString() +
                ", car=" + car.toString() +
                '}';
    }
}
