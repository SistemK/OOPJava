package gb_oop_java.sem1.hw;

public class Product {
    private String name;
    private Integer rating;
    private Integer price;

    public Product(String name, Integer rating, Integer price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Продукт - " + name +
                ", рейтинг - " + rating +
                ", цена - " + price;
    }

    public String getName() {
        return name;
    }

    public Integer getRating() {
        return rating;
    }

    public Integer getPrice() {
        return price;
    }
}
