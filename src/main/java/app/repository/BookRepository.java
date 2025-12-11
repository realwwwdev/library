package app.repository;

import app.domain.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository {
    private final List<Book> books = new ArrayList<>();

    public void save(Book book) {
        books.add(book);
    }

    public Optional<Book> findByCode(int code) {
        return books.stream().filter(b -> b.getCode() == code).findFirst();
    }

    public List<Book> findAll() {
        return new ArrayList<>(books);
    }

    public boolean deleteByCode(int code) {
        return books.removeIf(b -> b.getCode() == code);
    }

}
