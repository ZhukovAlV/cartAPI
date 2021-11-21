package com.company.entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> listProduct = new ArrayList<>();

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void addProduct(Product product) {
        listProduct.add(product);
    }

    public void removeProduct(Product product) {
        listProduct.remove(product);
    }
}
