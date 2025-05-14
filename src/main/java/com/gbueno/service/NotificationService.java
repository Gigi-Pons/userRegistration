package com.gbueno.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class NotificationService implements NotificationRepository{
    @Value("${mail.host}")
    private String host;

    @Value("${mail.port}")
    private String port;

    //instead of sending to email for now we'll print to screen
    @Override
    public void send(String message, String email) {
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);
    }
}
