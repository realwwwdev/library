package app;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList = new ArrayList<>();

    public void addBook(String title, String author, int code) {
        Book book = new Book(title, author, code);
        bookList.add(book);
    }

    public void showBooks() {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }
}
