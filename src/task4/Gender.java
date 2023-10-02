package task4;

public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE");
    private final String gender;
    Gender(String gender){ this.gender = gender;}

    @Override
    public String toString() {
        return
                "gender: '" + gender;

    }
}
