package task3;
public class Book extends Papyrus{
    protected int pages;
    protected String title;

    public Book(String size, int layers, int pages, String title) {
        super(size, layers);
        this.pages = pages;
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + ", pages: "+pages+" , title: "+title;
    }
}
