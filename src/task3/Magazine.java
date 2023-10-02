package task3;
public class Magazine extends Book{
    private String cover;

    public Magazine(String size, int layers, int pages, String title, String cover) {
        super(size, layers, pages, title);
        this.cover = cover;
    }

    @Override
    public String toString() {
        return super.toString() + ", cover: " + cover;
    }
}
