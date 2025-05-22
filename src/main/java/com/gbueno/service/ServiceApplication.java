package com.gbueno.service;

import com.gbueno.service.entities.Address;
import com.gbueno.service.entities.Profile;
import com.gbueno.service.entities.Tag;
import com.gbueno.service.entities.User;
import com.gbueno.service.repositories.AddressRepository;
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
		var addressRepository = context.getBean(AddressRepository.class);

		var user = repository.findByEmail("Bessie@gmail.com")
				.orElseGet(() -> {
					var newUser = User.builder()
						.name("Bessie")
						.email("Bessie@gmail.com")
						.password("password")
						.build();
					return repository.save(new User());
				});

//		var profile = Profile.builder()
//				.bio("bio")
//				.build();
//
//		profile.setUser(user);
//		profileRepository.save(profile);
//		user.setProfile(profile);
//		repository.save(user);

		var address = Address.builder()
				.street("Congress")
				.city("Austin")
				.zip("78703")
				.build();


		address.setUser(user);
		addressRepository.save(address);

	}

}
