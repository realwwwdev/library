package app.ui;

import app.domain.Book;
import app.repository.BookRepository;
import app.service.LibraryService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookRepository repository = new BookRepository();
        LibraryService library = new LibraryService(repository);
        library.addBook("Анна Каренина", "Толстой", 10724, Arrays.asList("Роман", "Социальный"));
        library.addBook("Война и мир", "Толстой", 10725, Arrays.asList("Роман", "Исторический"));
        library.addBook("Мастер и Маргарита", "Булгаков", 10581, Arrays.asList("Роман", "Философский"));
        library.addBook("Собачье сердце", "Булгаков", 10582, Arrays.asList("Повесть", "Социальный"));

        if (library.changeTitle(10725, "Война и мир [2 издание]")) {
            System.out.println("Название обновлено на 'Война и мир [2 издание]'");
        } else {
            System.out.println("Книга с кодом 10725 не найдена");
        }

        System.out.println("\nВсе книги:");
        for (Book b : library.getAllBooks()) {
            System.out.println(b);
        }

        System.out.println("\nПоиск книг по автору 'Булгаков':");
        List<Book> booksByAuthor = library.findBooksByAuthor("Булгаков");
        if (booksByAuthor.isEmpty()) {
            System.out.println("Книги автора 'Булгаков' не найдены");
        } else {
            booksByAuthor.forEach(System.out::println);
        }

        System.out.println("\nПоиск книг по жанру: 'Роман'");
        List<Book> booksByGenre = library.findBooksByGenre("Роман");
        if (booksByGenre.isEmpty()) {
            System.out.println("Книги с жанром 'Роман' не найдены");
            } else {
            booksByGenre.forEach(System.out::println);
        }

        System.out.println("\nУдаление книги с кодом 10724:");
        if (library.deleteBook(10724)) {
            System.out.println("Книга с кодом 10724 удалена");
        } else {
            System.out.println("Книга с кодом 10724 не найдена");
        }
    }
}
