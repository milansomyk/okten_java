package task1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Hahahahahh", 123);
        book1.print();
        Magazine magazine1 = new Magazine("task1.Magazine",12, 100);
        magazine1.print();
        Printable[] printables ={
                book1,
                magazine1,
                new Book("sdfasdf",1000),
                new Book("Lol",300),
                new Book("Keke",673),
                new Magazine("Za war",67, 4),
                new Magazine("Loki",96, 10)
        };
        for (Printable printable : printables) {
            printable.print();
        }
    }
}