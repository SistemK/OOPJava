package gb_oop_java.sem6.cw.ex1;

public class HtmlFormatter implements Formatter {

    @Override
    public void format(Book book) {
        System.out.println("Книга " + book + " отформатирована в формат HTML");
    }
}

