package gb_oop_java.sem1.hw;

import java.util.ArrayList;
import java.util.List;

public class CategoryProd {
    private String name;
    private List<Product> arr = new ArrayList<>();

    public CategoryProd(String name, Product product) {
        this.name = name;
        this.arr.add(product);
    }

    public CategoryProd(String name) {
        this.name = name;
       // arr.add(prod1);
    }

    /***
     * @apiNote добавление продукта в категирию
     * @param product наименование продукта
     */
    public void addProduct(Product product){
        arr.add(product);
    }

    @Override
    public String toString() {
        return "Название категории - " + name + "\n"+ arr.toString().replaceAll("^\\[|\\]$|\\,", "");
    }
}
