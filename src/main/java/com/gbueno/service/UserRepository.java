package com.gbueno.service;

import org.springframework.stereotype.Repository;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
