package app;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Анна Каренина", "Толстой", 10724, Arrays.asList("Роман", "Социальный"));
        library.addBook("Война и мир", "Толстой", 10725, Arrays.asList("Роман", "Исторический"));
        library.addBook("Мастер и Маргарита", "Булгаков", 10581, Arrays.asList("Роман", "Философский"));
        library.addBook("Собачье сердце", "Булгаков", 10582, Arrays.asList("Повесть", "Социальный"));

        library.changeTitle(10725, "Война и мир [2 издание]");
        library.showBooks();

        System.out.println("\nПоиск книг по автору 'Булгаков':");
        library.findBooksByAuthor(("булгаков"));

        library.deleteBook(10724);
    }
}
