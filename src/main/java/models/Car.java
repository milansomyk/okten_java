package models;

import enums.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String model;
    @Enumerated(EnumType.STRING)
    private Type body;
    private int power;
    private double price;
    private int year;

    public Car(String model, Type body, int power, double price, int year) {
        this.model = model;
        this.body = body;
        this.power = power;
        this.price = price;
        this.year = year;
    }
}
