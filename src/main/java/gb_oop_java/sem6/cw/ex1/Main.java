package gb_oop_java.sem6.cw.ex1;

public class Main {
    public static void main(String[] args) {
        Book bk1 = new Book("Пикуль", "Восход", 2001, new BookGenre("История"));
        Library library1 = new Library();
        System.out.println(library1.findListBookByAuthor("Пикуль"));
        Formatter formatter = new JsonFormatter();
        formatter.format(library1.findListBookByAuthor("Пикуль").get(0));
    }
}
