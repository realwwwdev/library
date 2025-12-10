package app.model;

import java.util.List;

public class Book {
    private String title;
    private String author;
    private int code;
    private List<String> genres;

    public Book (String title, String author, int code, List<String> genres) {
        this.title = title;
        this.author = author;
        this.code = code;
        this.genres = genres;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle(String title) {
        this.title =  title;
    }

    public int getCode () {
        return code;
    }

    public String getAuthor () {
        return author;
    }
    public List<String> genres() {
        return genres;
    }

    public List<String> getGenres() {return genres;}

    public String toString () {
        return "Название: " + title +
                " | Автор: " + author +
                " | Код издания: " + code +
                " | Жанр: " + genres;
    }
}
