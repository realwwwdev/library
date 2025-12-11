package app.service;

import app.domain.Book;
import app.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private final BookRepository repository;

    public LibraryService(BookRepository repository) {
        this.repository = repository;
    }

    public void addBook(String title, String author, int code, List<String> genres) {
        Book book = new Book(title, author, code, genres);
        repository.save(book);
    }

    public boolean changeTitle(int code, String newTitle) {
        return repository.findByCode(code).map(book -> {
            book.setTitle(newTitle);
            return true;
        }).orElse(false);

    }

    public boolean deleteBook (int code) {
        return repository.deleteByCode(code);
    }

    public List<Book> findBookByTitle (String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : repository.findAll()) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findBooksByAuthor (String author) {
        List<Book> result = new ArrayList<>();
        for (Book  book : repository.findAll()) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findBooksByGenre (String genre) {
        List<Book> result = new ArrayList<>();
        for (Book  book : repository.findAll()) {
            for (String g : book.getGenres()) {
                if (g.equalsIgnoreCase(genre)) {
                    result.add(book);
                    break;
                }
            }
        }
        return result;
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }
}

