package com.company.service;

import com.company.entity.Cart;
import com.company.entity.Client;
import com.company.entity.Order;

public interface ServiceOrder {

    // Создаем заказ
    Order createOrder(Client client, Cart cart);

    // Отмена заказа
    void cancelOrder(Order order);

    // Оплата заказа
    void payOrder(Order order);
}
