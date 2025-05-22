package com.gbueno.service.repositories;

import com.gbueno.service.entities.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.kotlin.CoroutineCrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
