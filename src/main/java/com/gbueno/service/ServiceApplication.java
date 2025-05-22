package com.gbueno.service;

import com.gbueno.service.entities.Address;
import com.gbueno.service.entities.Profile;
import com.gbueno.service.entities.Tag;
import com.gbueno.service.entities.User;
import com.gbueno.service.repositories.ProfileRepository;
import com.gbueno.service.repositories.UserRepository;
import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ServiceApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ServiceApplication.class, args);
		var repository = context.getBean(UserRepository.class);
		var profileRepository = context.getBean(ProfileRepository.class);

//		var user = User.builder()
//				.name("Bessie")
//				.password("password")
//				.email("Bessie@gmail.com")
//				.build();
//		var profile = Profile.builder()
//				.bio("bio")
//				.build();
//
//		profile.setUser(user);
//		profileRepository.save(profile);
//		user.setProfile(profile);
//		repository.save(user);



	}

}
