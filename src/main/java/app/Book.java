package app;

public class Book {
    private String title;
    private String author;
    private int code;

    public Book (String title, String author, int code) {
        this.title = title;
        this.author = author;
        this.code = code;
    }

    public String toString () {
        return "Название: | " + title +
                " | Автор: " + author +
                " Код издания: " + code;
    }
}
