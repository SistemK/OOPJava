package gb_oop_java.sem6.cw.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Library implements Searchable {
    List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public Library() {
        books = Arrays.asList(
                new Book("Пикуль", "Восход", 2001, new BookGenre("История")),
                new Book("Пушкин", "Дуб", 1966),
                new Book("Кинг", "Кладбище домашних животных", 1999, new BookGenre("Ужасы")),
                new Book("Пикуль", "Царство", 2004,new BookGenre("История")),
                new ElectronBook("Пикуль", "Захват", 2004, "JSON", 340D));
    }

    @Override
    public List<Book> findListBookByAuthor(String author) {
        return books.stream().filter(el-> el.getAutor().equals(author)).collect(Collectors.toList());
    }
}
