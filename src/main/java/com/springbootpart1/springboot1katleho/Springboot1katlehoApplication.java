package com.springbootpart1.springboot1katleho;

import Service.UserServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot1katlehoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Springboot1katlehoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserServiceImpl usr = new UserServiceImpl();
		usr.getUser(0);
	}
}
