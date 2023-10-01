package task2;

public enum Proccessor {
    AMD("AMD"),
    INTEL("INTEL");
    private final String brand;

    Proccessor(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'';
    }
}
