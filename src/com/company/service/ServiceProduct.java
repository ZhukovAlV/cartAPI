package com.company.service;

import com.company.entity.Product;

public interface ServiceProduct {

    // Количество товаров
    int getCountProduct(Product product);

    // Добавить товар
    Product setCountProduct(Product product, int count);

    // Добавить товар
    Product createProduct(String name, double price, int countProduct);
}
