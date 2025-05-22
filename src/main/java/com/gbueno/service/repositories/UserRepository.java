package com.gbueno.service.repositories;

import com.gbueno.service.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
