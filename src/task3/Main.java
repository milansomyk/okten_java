package task3;

public class Main {
    public static void main(String[] args) {
        Comics comics = new Comics("A4",2, 10, "Manga",16,"anime");
        Magazine magazine = new Magazine("A5",4, 30, "Care and love", "Glance");
        System.out.println(comics.toString());
        System.out.println(magazine.toString());
    }
}
