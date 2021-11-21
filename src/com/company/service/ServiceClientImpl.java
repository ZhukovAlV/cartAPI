package com.company.service;

import com.company.entity.Client;

public class ServiceClientImpl implements ServiceClient {

    @Override
    public Client createClient(String firstName, String lastName, String secondName, String login, String password) {
        System.out.println("Создаем нового пользователя: " +
                firstName + " " + lastName+ " " + secondName);
        return new Client(firstName,lastName,secondName,login,password);
    }
}
