package com.company.service;

import com.company.entity.Cart;
import com.company.entity.Product;

public class ServiceImplCart implements ServiceCart {

    @Override
    public Cart createCart() {
        System.out.println("Создаем корзину");
        return new Cart();
    }

    @Override
    public void increaseProduct(Cart cart, Product product) {
        System.out.println("Добавляем в корзину продукт: " + product.getName());
        cart.addProduct(product);
    }

    @Override
    public void decreaseProduct(Cart cart, Product product) {
        System.out.println("Убираем из корзины продукт: " + product.getName());
        cart.removeProduct(product);
    }

    @Override
    public void saveProduct(Cart cart) {
        System.out.println("Сохраняем корзину");
        // Если сохраняем корзину, то вычитаем со склада выбранные товары
        for (Product product : cart.getListProduct()) {
            product.setCountProduct(product.getCountProduct() - 1);
        }
    }

    @Override
    public void cancelProduct(Cart cart) {
        System.out.println("Отменяем корзину");
        for (Product product : cart.getListProduct()) {
            // Если продукт уже не в корзине, то увеличиваем его количество на складе
            product.setCountProduct(product.getCountProduct() + 1);
        }
    }

    @Override
    public void clearCart(Cart cart) {
        System.out.println("Очищаем корзину");
        // Очищаем корзину
        cart.getListProduct().clear();
    }
}
