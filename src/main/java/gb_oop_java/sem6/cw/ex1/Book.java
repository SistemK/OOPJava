package gb_oop_java.sem6.cw.ex1;

public class Book {
    private String autor;
    private String name;
    private Integer year;
    private BookGenre bookGenre;

    public Book(String autor, String name, Integer year) {
        this.autor = autor;
        this.name = name;
        this.year = year;
    }

    public Book(String autor, String name, Integer year, BookGenre bookGenre) {
        this.autor = autor;
        this.name = name;
        this.year = year;
        this.bookGenre = bookGenre;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "autor='" + autor + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
