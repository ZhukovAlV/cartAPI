package com.company.service;

import com.company.entity.Client;

public interface ServiceClient {

    Client createClient(String firstName, String lastName, String secondName, String login, String password);
}
