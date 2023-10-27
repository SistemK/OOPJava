package gb_oop_java.sem1.hw;

import java.util.HashMap;

public class myModules {
    private static Integer count = 1;

    /**
     * @param arr     массив с продуктами
     * @param product добавляемый продукт
     * @param count   количество добавляемых продуктов
     * @apiNote Добавление продукта в массив в количестве count штук
     */
    public static void addProduct(HashMap<Product, Integer> arr, Product product, Integer count) {
        if (arr.containsKey(product)) {
            arr.put(product, arr.get(product).intValue() + count);
        } else {
            arr.put(product, count);
        }
    }

    /**
     * @param arr     массив с продуктами
     * @param product добавляемый продукт
     * @apiNote Добавление продукта в массив в количестве 1 штуки
     */
    public static void addProduct(HashMap<Product, Integer> arr, Product product) {
        System.out.println("222222");
        if (arr.containsKey(product)) {
            arr.put(product, arr.get(product).intValue() + 1);
        } else {
            arr.put(product, 1);
        }
    }

    /**
     * @param arr     массив с продуктами
     * @param product удаляемый продукт
     * @param count   Количество удаляемых продуктов
     * @apiNote удаление продуктов их массива в количестве count штук
     */
    public static void delProduct(HashMap<Product, Integer> arr, Product product, Integer count) {
        arr.put(product, arr.get(product).intValue() - count);
    }
}
