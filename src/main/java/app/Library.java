package app;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList = new ArrayList<>();

    public void addBook(String title, String author, int code) {
        Book book = new Book(title, author, code);
        bookList.add(book);
    }

    public void changeTitle(int code, String newTitle) {
        for (Book book : bookList) {
            if (book.getCode() == code) {
                book.setTitle(newTitle);
                System.out.println("Название обновлено");
                return;
            }
            System.out.println("Книга с кодом: " + code + " не найдена");
        }

    }

    public void showBooks() {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }
}
