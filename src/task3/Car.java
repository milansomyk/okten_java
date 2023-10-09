package task3;

public class Car {
    String model;
    int power;
    Owner owner;
    int price;
    int year;

    public Car() {}

    public Car(String model, int power, String name, int age, int experience, int price, int year){
        this.model = model;
        this.power = power;
        this.owner = new Owner(name,age,experience);
        this.price = price;
        this.year = year;
    }

    public void upgradeEngine(){
        this.power += this.power*10/100;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", owner=" + owner +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
