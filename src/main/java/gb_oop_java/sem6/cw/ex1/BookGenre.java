package gb_oop_java.sem6.cw.ex1;

import java.security.PrivateKey;

public class BookGenre implements Genre {
    private String genre;

    public BookGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getGenre(Book book) {
        return genre;
    }
}
