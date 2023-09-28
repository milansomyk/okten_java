package hw1;

import lombok.Data;
@Data
public class Book {
    String title;
    int pages;
    String[] Authors;
    String genre;

    public Book(String title, int pages, String[] authors, String genre) {
        this.title = title;
        this.pages = pages;
        this.Authors = authors;
        this.genre = genre;
    }
}
