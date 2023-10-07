package task4;

public class Pet implements Comparable<Pet> {
    private int petId;
    private String petName;

    public Pet(int petId, String petName) {
        this.petId = petId;
        this.petName = petName;
    }

    public int getPetId() {
        return petId;
    }

    @Override
    public String toString() {
            return "Pet{" +
                    "petId=" + petId +
                    ", petName='" + petName + '\'' +
                    '}';
    }


    @Override
    public int compareTo(Pet o) {
        return this.petId-o.petId;
    }
}
