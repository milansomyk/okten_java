package hw1;

import lombok.Data;
@Data
public class Dog {
    String name;
    int age;
    String poroda;

    public Dog(String name, int age, String poroda) {
        this.name = name;
        this.age = age;
        this.poroda = poroda;
    }
}
