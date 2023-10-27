package gb_oop_java.sem1.hw;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    private String name;
    private Map<Product, Integer> arr = new HashMap<>();

    public Shop(String name) {
        this.name = name;
    }
    public void addProduct(Product product, Integer count){
            myModules.addProduct((HashMap) arr, product, count);
    }

    public void addProduct(Product product){
        myModules.addProduct((HashMap) arr, product);
    }

    public void delProduct(Product product, Integer count){
        myModules.delProduct((HashMap) arr, product, count);
    }

    public Integer getCountProduct(Product product){
        Integer count = 0;
        if (arr.containsKey(product)) {
            count = arr.get(product).intValue();
        }
        return count;
    }



    @Override
    public String toString() {
        return  "Магазин - '" + name + '\n' +
                " Остаток товаров: \n" + arr.toString().replaceAll("^\\{|\\}$|", "").replaceAll("=", ", остаток - ");
    }
}
