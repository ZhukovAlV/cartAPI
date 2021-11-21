package com.company.service;

import com.company.entity.Cart;
import com.company.entity.Product;

public interface ServiceCart {

    // Создаем корзину
    Cart createCart();

    // Увеличить количество товара в корзине
    void increaseProduct(Cart cart, Product product);

    // Уменьшить количество товара в корзине
    void decreaseProduct(Cart cart, Product product);

    // Сохранить товары в корзине
    void saveProduct(Cart cart);

    // Отменить товары в корзине
    void cancelProduct(Cart cart);

    // Чистим корзину
    void clearCart(Cart cart);
}
