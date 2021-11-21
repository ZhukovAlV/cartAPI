package com.company;

import com.company.entity.Cart;
import com.company.entity.Client;
import com.company.entity.Order;
import com.company.entity.Product;
import com.company.service.*;

public class Main {

    public static void main(String[] args) {

        // Создаем клиента
        ServiceClient serviceClient = new ServiceClientImpl();
        Client client = serviceClient.createClient("Иванов",
                "Иван","Иванович", "ivan", "123456");

	    // Создаем товар
        ServiceProduct serviceProduct = new ServiceProductImpl();
        Product product = serviceProduct.createProduct("Процессор", 5000, 10);

        // Создаем корзину
        ServiceCart serviceCart = new ServiceImplCart();
        Cart cart = serviceCart.createCart();

        // Добавляем товар в корзину
        serviceCart.increaseProduct(cart, product);

        // Сохраняем корзину
        serviceCart.saveProduct(cart);

        // Создаем заказ
        ServiceOrder serviceOrder = new ServiceOrderImpl();
        Order order = serviceOrder.createOrder(client, cart);

        // Совершаем покупку
        serviceOrder.payOrder(order);

        // Очищаем корзину
        serviceCart.clearCart(cart);
    }
}
