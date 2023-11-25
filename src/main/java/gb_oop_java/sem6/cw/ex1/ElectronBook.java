package gb_oop_java.sem6.cw.ex1;

public class ElectronBook extends Book {
    private String formatRead;
    private Double size;

    public ElectronBook(String autor, String name, Integer year, String formatRead, Double size) {
        super(autor, name, year);
        this.formatRead = formatRead;
        this.size = size;
    }

    @Override
    public String toString() {
        return "ElectronBook{" +
                "formatRead='" + formatRead + '\'' +
                ", size=" + size +
                '}';
    }
}
