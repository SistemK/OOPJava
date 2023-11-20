package gb_oop_java.sem4.hw;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        System.out.println(calc1.sumCollection(Arrays.asList(1,3,5,6)));
        System.out.println(calc1.sumCollection(Arrays.asList(1.2,3.5,5,6)));
        System.out.println(calc1.multiCollection(Arrays.asList(1,3,5,6)));
        System.out.println(calc1.divCollection(Arrays.asList(100,2,10)));
        System.out.println(calc1.multiSingle(2, 3.2));
        System.out.println(calc1.divSingle(2, 3.2));
        System.out.println(calc1.binar(156));
        System.out.println(calc1.binar(156.231));
        System.out.println(calc1.binar("Privet"));

    }
}
