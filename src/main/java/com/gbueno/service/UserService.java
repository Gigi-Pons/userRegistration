package com.gbueno.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepo;
    private final NotificationRepository notificationRepo;

    //constructor
    public UserService(UserRepository userRepo, NotificationRepository notificationRepo) {
        this.userRepo = userRepo;
        this.notificationRepo = notificationRepo;

    }

    public void registerUser(User user) {
        userRepo.save(user);
        notificationRepo.send("Registration successful!" , user.getEmail());
    }
}
