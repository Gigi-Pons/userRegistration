package com.gbueno.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class NotificationService implements NotificationRepository{
    @Value("${mail.host}")
    private String host;

    @Value("${mail.port}")
    private String port;

    @Override
    public void send(String message, String email) {

    }
}
