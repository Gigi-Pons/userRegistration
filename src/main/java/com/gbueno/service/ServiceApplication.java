package com.gbueno.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ServiceApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ServiceApplication.class, args);
		var userService = context.getBean(UserService.class);
		userService.registerUser(new User(1L, "grecia@gmail.com", "123", "Grecia Bueno"));
	}

}
