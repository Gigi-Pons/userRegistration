package com.gbueno.service;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositoryInMemory implements UserRepository {
    private final Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        System.out.println("User saved: " + user);
        users.put(user.getEmail(), user);
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }
}
