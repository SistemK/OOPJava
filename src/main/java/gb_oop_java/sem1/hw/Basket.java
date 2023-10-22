package gb_oop_java.sem1.hw;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private Integer num;
    private List<Product> arr = new ArrayList<>();


    public Basket(Integer num, Product product) {
        this.num = num;
        this.arr.add(product);
    }

    public Basket(Integer num) {
        this.num = num;
    }

    public void addProduct(Product product){
        arr.add(product);
    }

    public void delProduct(Product product){
        arr.remove(product);
    }

    @Override
    public String toString() {
        return "Корзина номер " + num + "\n"+ arr.toString().replaceAll("^\\[|\\]$|\\,", "");
    }
}



