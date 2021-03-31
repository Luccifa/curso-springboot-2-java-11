package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	// @Autowired =>  injestao de dependencia, associa uma instancia de 
	//                userRepositor automaticamente (sem precisar de set ou
	//                construtor)
    // CommandLineRunner => implementando essa interface, os comando dentro
	//                      de void run serão executados qdo o programa iniciar
	
	@Autowired
	private UserRepository userRepository;

	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

	
	
	
}
