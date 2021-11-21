package com.company.service;

import com.company.entity.Cart;
import com.company.entity.Client;
import com.company.entity.Order;
import com.company.entity.State;

public class ServiceOrderImpl implements ServiceOrder {

    @Override
    public Order createOrder(Client client, Cart cart) {
        System.out.println("Создаем новый заказ для клиента: " + client.getFirstName() + " " +
                client.getLastName() + " " + client.getSecondName());
        return new Order(client,cart);
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Отменяем заказ для клиента: " + order.getClient().getFirstName() + " " +
                order.getClient().getLastName() + " " + order.getClient().getSecondName());
        order.setState(State.CANCELLED);
    }

    @Override
    public void payOrder(Order order) {
        System.out.println("Подтверждаем заказ для клиента: " + order.getClient().getFirstName() + " " +
                order.getClient().getLastName() + " " + order.getClient().getSecondName());
        order.setState(State.PAYMENT_COMPLETED);
    }
}
