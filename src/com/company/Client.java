package com.company;

import java.util.UUID;

public class Client {
    private String id;
    private String firstName;
    private String lastName;
    private String secondName;
    private String login;
    private String password;

    public Client() {
        id = UUID.randomUUID().toString();
    }
}
