package com.gbueno.service;

import com.gbueno.service.entities.Address;
import com.gbueno.service.entities.Profile;
import com.gbueno.service.entities.Tag;
import com.gbueno.service.entities.User;
import com.gbueno.service.repositories.AddressRepository;
import com.gbueno.service.repositories.ProfileRepository;
import com.gbueno.service.repositories.UserRepository;
import com.gbueno.service.services.UserService;
import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ServiceApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ServiceApplication.class, args);
		var service = context.getBean(UserService.class);
		service.fetchAddress();




	}


}
