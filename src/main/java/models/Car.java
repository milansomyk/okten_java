package models;

import enums.Type;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String model;
    @Enumerated(EnumType.STRING)
    Type body;
    int power;
    int price;
    int year;

    public Car(String model, Type body, int power, int price, int year) {
        this.model = model;
        this.body = body;
        this.power = power;
        this.price = price;
        this.year = year;
    }

    public Car() {

    }
}
