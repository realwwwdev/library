package app;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Анна Каренина", "Толстой", 10724);
        library.addBook("Война и мир", "Толстой", 10936);
        library.addBook("Мастер и Маргарита", "Булгаков", 10581);
        library.showBooks();

        library.changeTitle(10936, "Война и мир [2 издание]");
        library.showBooks();

        library.deleteBook(10724);
        library.showBooks();

        System.out.println("\nПоиск книг по слову 'мир':");
        library.findBookByTitle("мир");
    }
}
