package com.company;

public interface ServiceCart {

    // Количество товаров
    void getCountProduct();

    // Добавить товар
    void addProduct();

    // Увеличить количество товара в корзине
    void increaseProduct();

    // Уменьшить количество товара в корзине
    void decreaseProduct();

    // Сохранить товары в корзине
    void saveProduct();

}
