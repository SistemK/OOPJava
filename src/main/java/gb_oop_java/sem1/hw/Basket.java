package gb_oop_java.sem1.hw;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Integer num;
    private Map<Product, Integer> arr = new HashMap<>();

    public Basket(Integer num) {
        this.num = num;
    }

    public Basket() {
    }

    public void addProduct(Product product, Integer count){
            myModules.addProduct((HashMap) arr, product, count);
    }

    public void delProduct(Product product, Integer count){
        myModules.delProduct((HashMap) arr, product, count);
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Корзина номер " + num + "\n"+ arr.toString().replaceAll("^\\{|\\}$|", "").replaceAll("=", ", количество - ");
    }
}



