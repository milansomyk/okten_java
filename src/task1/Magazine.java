package task1;

public class Magazine implements Printable{
    String title;
    int pages;
    int magazineCount;
    public Magazine(String title, int pages, int magazineCount) {
        this.magazineCount = magazineCount;
        this.pages = pages;
        this.title = title;
    }

    @Override
    public String toString() {
        return "task1.Magazine{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", magazineCount=" + magazineCount +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
