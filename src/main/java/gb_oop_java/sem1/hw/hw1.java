package gb_oop_java.sem1.hw;

public class hw1 {
    public static void main(String[] args) {
        Product prod1 = new Product("Яблоко", 5, 200);
        Product prod2 = new Product("Наполеон", 7, 180);
        Product prod3 = new Product("Груша", 3, 220);
        Product prod4 = new Product("Картошка", 8, 60);
        Product prod5 = new Product("Морковь", 4, 40);
        Product prod6 = new Product("Капуста", 2, 20);
//        CategoryProd cat1 = new CategoryProd("Фрукты");
//        CategoryProd cat2 = new CategoryProd("Овощи");
//        CategoryProd cat3 = new CategoryProd("Сладости", prod2);
//        cat1.addProduct(prod1);
//        cat1.addProduct(prod3);
//        cat2.addProduct(prod4);
//        cat2.addProduct(prod5);
//        cat2.addProduct(prod6);
//        System.out.println(cat1);
//        System.out.println(cat2);
//        System.out.println(cat3);

        Basket bask1 = new Basket(1);
        bask1.addProduct(prod1);
        bask1.addProduct(prod2);
        bask1.addProduct(prod3);
        System.out.println(bask1);
        bask1.delProduct(prod2);
        System.out.println(bask1);


    }
}
