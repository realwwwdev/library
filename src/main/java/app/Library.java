package app;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList = new ArrayList<>();

    public void addBook(String title, String author, int code, List<String> genres) {
        Book book = new Book(title, author, code, genres);
        bookList.add(book);
    }

    public void changeTitle(int code, String newTitle) {
        for (Book book : bookList) {
            if (book.getCode() == code) {
                book.setTitle(newTitle);
                System.out.println("Название обновлено на '" + newTitle + "'");
                return;
            }
        }
        System.out.println("Книга с кодом: " + code + " не найдена");

    }

    public void deleteBook (int code) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getCode() == code) {
                bookList.remove(i);
                System.out.println("Книга с кодом: " + code + " удалена");
                return;
            }
        }
        System.out.println("Книга с кодом: " + code + " не найдена");
    }

    public void findBookByTitle (String title) {
        int matches = 0;

        for (Book book : bookList) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(book);
                matches++;
            }
        }

        if(matches == 0) {
            System.out.println("Книга с названием: '" + title + "' не найдена");
        }
    }

    public void findBooksByAuthor (String author) {
        int matches = 0;

        for (Book book : bookList) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
            System.out.println(book);
            matches++;
            }
        }

        if(matches == 0) {
            System.out.println("Книги автора: '" + author + "' не найдены");
        }
    }

    public void showBooks() {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }
}
