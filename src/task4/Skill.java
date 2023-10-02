package task4;

public class Skill {
    String title;
    int exp;

    public Skill(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "title='" + title + '\'' +
                ", exp=" + exp +
                '}';
    }
}
