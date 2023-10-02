package task3;
public class Comics extends Book{
    private int age;
    private String genre;

    public Comics(String size, int layers, int pages, String title, int age, String genre) {
        super(size, layers, pages, title);
        this.age = age;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + " , age: "+age+" , genre:"+genre;
    }
}
