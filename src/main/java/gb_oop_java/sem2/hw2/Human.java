package gb_oop_java.sem2.hw2;

public class Human extends LivingChar {
    public Human(String name, int maxHeight, int maxLenght) {
        super(name, maxHeight, maxLenght);
    }

    @Override
    public String toString() {
        return "человек с именем " + name;
    }
}
