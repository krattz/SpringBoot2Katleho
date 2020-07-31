package com.springbootpart1.springboot1katleho;

import Dao.FakeRepo;
import Service.UserServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class Springboot1katlehoApplicationTests {

	@Autowired
	UserServiceImpl userService;
	FakeRepo repo;
	@Test
	void contextLoads() {
		userService.addUser(6, "Congo", "Zumba");
		userService.removeUser(4);
		Assert.assertEquals(userService.getUser(1), repo.findUserById(1));
		Assert.assertEquals("Congo added", userService.getUser(6));
		Assert.assertFalse(userService.getUser(4).contains("Dan"));

	}
	@org.junit.Test
	public void getUserServiceImpl(){
		for (int i = 0; i<4; i++){
			System.out.println(userService.getUser(1));
		}
		Assert.assertEquals(userService.getUser(1), "maria");
	}

	@Autowired
	private TestRestTemplate template;

	@org.junit.Test
	public void shouldSucceedWith200() {
		ResponseEntity<String> response = template.withBasicAuth("user", "pass").getForEntity("/", String.class);
		Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
	}

}
