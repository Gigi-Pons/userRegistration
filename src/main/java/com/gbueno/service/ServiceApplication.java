package com.gbueno.service;

import com.gbueno.service.entities.User;
import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ServiceApplication {

	public static void main(String[] args) {

//		ApplicationContext context = SpringApplication.run(ServiceApplication.class, args);
		//This returns a user object.  Example of using builder method in main class
		//and @builder annotation in user
		var user = User.builder()
				.name("Bessie")
				.password("password")
				.email("Bessie@gmail.com")
				.build();
	}

}
