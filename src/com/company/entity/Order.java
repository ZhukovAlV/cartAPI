package com.company.entity;

public class Order {
    Client client;
    Cart cart;
    State state;

    public Order(Client client, Cart cart) {
        this.client = client;
        this.cart = cart;
    }

    // Статус заказа
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Client getClient() {
        return client;
    }
}
