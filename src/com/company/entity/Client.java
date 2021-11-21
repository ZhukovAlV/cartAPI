package com.company.entity;

import java.util.UUID;

public class Client {
    private String id;
    private String firstName;
    private String lastName;
    private String secondName;
    private String login;
    private String password;

    public Client(String firstName, String lastName, String secondName, String login, String password) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.login = login;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }
}
