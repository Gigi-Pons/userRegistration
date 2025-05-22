package com.gbueno.service.services;

import com.gbueno.service.entities.Address;
import com.gbueno.service.entities.User;
import com.gbueno.service.repositories.AddressRepository;
import com.gbueno.service.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final EntityManager entityManager;
    private final AddressRepository addressRepository;

    public void showEntityStates() {
        var user = User.builder()
                .name("John Doe")
                .email("john@gmail.com")
                .password("123")
                .build();

        userRepository.save(user);
    }

    public void fetchAddress() {
        var address = addressRepository.findById(1L).orElseThrow();

    }
}
