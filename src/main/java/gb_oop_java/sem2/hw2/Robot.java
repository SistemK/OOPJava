package gb_oop_java.sem2.hw2;

public class Robot extends Master {

    public Robot(String name, int maxHeight, int maxLenght) {
        super(name, maxHeight, maxLenght);
    }

    @Override
    public String toString() {
        return "робот с названием " + name;
    }
}
