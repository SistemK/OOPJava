package gb_oop_java.sem1.hw;

public class User {
    private String name;
    private String login;
    private String password;
    private static Integer count = 1;
    private Basket basket;

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
        basket = new Basket(count);
        count++;
    }

    /**
     * @param product добавляемый\удаляемый продект
     * @param count   количество продуктов
     * @param shop    магазин, из которого берется продукт
     * @apiNote Добавление продукта в корзину и удаление его из остатков магазина
     */
    public void takeProduct(Product product, Integer count, Shop shop) {
        if (shop.getCountProduct(product) - count > 0) {
            basket.addProduct(product, count);
            shop.delProduct(product, count);
        } else {
            System.out.println("Продуктов в магазине не хватает");
        }

    }

    public void getBasket() {
        System.out.println("Пользователь " + this.name + "\n" + basket.toString());
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Имя -" + name + '\'' +
                ", Логин - '" + login + ", номер корзины - " + basket.getNum() + '\n';
    }
}
