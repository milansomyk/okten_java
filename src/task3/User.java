package task3;

import sun.awt.ConstrainableGraphics;

import java.util.List;

public class User implements Comparable<User>{
    int id;
    String name;
    String surname;
    String email;
    int age;
    String gender;
    List<Skill> skills;
    Car car;

    public User(){}
    public User(int id, String name, String surname, String email, int age, String gender){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public User(int id, String name, String surname, String email, int age, String gender, List<Skill> skills, Car car){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = car;
    }

    public User(int id, String name, String surname, String email, int age, String gender,List<Skill> skills, String carName, int carYear, int carPower){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = new Car(carName, carYear, carPower);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", skills=" + skills +
                ", car=" + car +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.skills.size() - o.skills.size();
    }
}
