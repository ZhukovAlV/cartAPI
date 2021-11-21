package com.company.service;

import com.company.entity.Product;

public class ServiceProductImpl implements ServiceProduct {

    @Override
    public int getCountProduct(Product product) {
        int count = product.getCountProduct();
        System.out.println("Количество товара в корзине: " +  count);
        return count;
    }

    @Override
    public Product setCountProduct(Product product, int count) {
        System.out.println("Устанавливаем значение количества в товаре: " + product.getName() + " = " + count);
        product.setCountProduct(count);
        return product;
    }

    @Override
    public Product createProduct(String name, double price, int countProduct) {
        System.out.println("Создаем новый товар: " + name);
        return new Product(name, price, countProduct);
    }
}
