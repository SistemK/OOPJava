package gb_oop_java.sem2.hw2;

public class Cat extends LivingChar {
    public Cat(String name, int maxHeight, int maxLenght) {
        super(name, maxHeight, maxLenght);
    }

    @Override
    public String toString() {
        return "кот с кличкой " + name;
    }
}
