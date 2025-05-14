package com.gbueno.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepo;

    //constructor
    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public void registerUser(User user) {
        userRepo.save(user);
    }
}
