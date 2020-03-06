package Java.Java9Features;

import java.util.Set;

public class Book {

    private String book;
    private String author;

    public Book(String external_book, Set<Object> of, double v) {
    }

    public Book() {
    }

    public static Book getBook() {
        return new Book();
    }

    public String getAuthor() {
        return author;
    }
}
