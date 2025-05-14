package com.gbueno.service;

public interface NotificationRepository {
    void send(String message, String email);
}
