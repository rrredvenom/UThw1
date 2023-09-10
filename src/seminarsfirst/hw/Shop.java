package seminarsfirst.hw;

import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @return отсортированный по возрастанию и цене список продуктов
     */
    public List<Product> getSortedListProducts() {
        for (int i = 0; i < products.size() - 1; i++) {
            int pos = i;
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(j).getCost() < products.get(pos).getCost()) pos = j;
            }
            products.add(i, products.get(pos));
            products.set(pos + 1, products.get(i + 1));
            products.remove(i + 1);
        }
        return products;
    }

    /**
     * @return самый дорогой продукт
     */
    public Product getMostExpensiveProduct() {
        int indexExpensiveProduct = 0;
        int costExpensiveProduct = products.get(0).getCost();
        for (int i = 1; i < products.size(); i++) {
            if (costExpensiveProduct < products.get(i).getCost()) {
                indexExpensiveProduct = i;
                costExpensiveProduct = products.get(i).getCost();
            }
        }
        return products.get(indexExpensiveProduct);
    }
}