package gb_oop_java.sem1.hw;

public class hw1 {
    public static void main(String[] args) {
        User user1 = new User("Висилий", "VS2003", "pass123");
        User user2 = new User("Николай", "NikLay", "pass123");
        Shop shop= new Shop("Околица");
        Product prod1 = new Product("Яблоко", 5, 200);
        Product prod2 = new Product("Наполеон", 7, 180);
        Product prod3 = new Product("Груша", 3, 220);
        Product prod4 = new Product("Картошка", 8, 60);
        Product prod5 = new Product("Морковь", 4, 40);
        Product prod6 = new Product("Капуста", 2, 20);
        Product prod7 = new Product("Пончик", 8, 120);
        CategoryProd cat1 = new CategoryProd("Фрукты");
        CategoryProd cat2 = new CategoryProd("Овощи");
        CategoryProd cat3 = new CategoryProd("Сладости", prod2, prod7);
        cat1.addProduct(prod1, prod3);
        cat2.addProduct(prod4, prod5, prod6);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

        shop.addProduct(prod1, 5);
        shop.addProduct(prod2, 10);
        shop.addProduct(prod3, 8);
        shop.addProduct(prod3, 10);
        shop.addProduct(prod1);
        System.out.println(shop);

        user1.takeProduct(prod1, 4, shop);
        user1.takeProduct(prod1, 3, shop);
        user1.takeProduct(prod1, 5, shop);
        user1.takeProduct(prod4, 5, shop);
        user1.takeProduct(prod3, 5, shop);

        System.out.println(user1);
        user1.getBasket();
        System.out.println(shop);

    }
}
