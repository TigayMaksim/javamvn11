package ru.netology.manager;

public class ProductManager {

    private Product[] products = new Product[0];

    public ProductManager() {
    }


    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }


    public Product[] findAll() {
        return products;
    }


    public Product[] removeById(int id) {
        int length = products.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[index] = product;
                index++;
                products = tmp;
            }
        }
        return products;
    }


    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : products) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }


    public boolean matches(Product product, String search) {
        return product.getTitle().contains(search);
    }


}



