package gb_oop_java.sem1.hw;

import java.util.ArrayList;
import java.util.List;

public class CategoryProd {
    private String name;
    private List<Product> arr = new ArrayList<>();

    public CategoryProd(String name, Product... product) {
        this.name = name;
        for (int i = 0; i<product.length; i++){
            this.arr.add(product[i]);
        }
    }

    public CategoryProd(String name) {
        this.name = name;
    }

    /**
     * @apiNote Добавление продуктов в категорию
     * @param product продукты, которые необходимо добавить в категорию
     */
    public void addProduct(Product... product){
        for (int i = 0; i<product.length; i++){
            this.arr.add(product[i]);
        }
    }

    @Override
    public String toString() {
        return "Категория - " + name + "\n"+ arr.toString().replaceAll("^\\[|\\]$", "");
    }
}
