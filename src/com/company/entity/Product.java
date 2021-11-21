package com.company.entity;

public class Product {
    private String name;
    private double price;
    private int countProduct;

    // Получаем название товара
    public String getName() {
        return name;
    }

    // Получаем цену товара
    public double getPrice() {
        return price;
    }

    // Устанавливаем в конструкторе количество товара, его цену и название
    public Product(String name, double price, int countProduct) {
        this.name = name;
        this.price = price;
        this.countProduct = countProduct;
    }

    // Получаем остаток товара
    public int getCountProduct() {
        return countProduct;
    }

    // Устанавливаем остаток товара
    public void setCountProduct(int countProduct) {
        this.countProduct = countProduct;
    }
}
