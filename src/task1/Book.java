package task1;

public class Book implements Printable{
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "task1.Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
