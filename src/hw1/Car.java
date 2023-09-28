package hw1;

import lombok.Data;
@Data

public class Car {
    private String model;
    private int power;
    private double volumeEngine;
    private boolean turbo;

    public Car(String model, int power, double volumeEngine, boolean turbo) {
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }
}
