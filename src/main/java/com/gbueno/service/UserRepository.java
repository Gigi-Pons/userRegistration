package com.gbueno.service;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
