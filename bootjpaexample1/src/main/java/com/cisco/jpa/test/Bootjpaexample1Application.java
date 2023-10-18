package com.cisco.jpa.test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cisco.jpa.test.dao.UserRepo;
import com.cisco.jpa.test.entities.User;

@SpringBootApplication
public class Bootjpaexample1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Bootjpaexample1Application.class, args);
		UserRepo userRepo=context.getBean(UserRepo.class);
		User user1=new User();
		user1.setName("Arup Sarkar");
		user1.setCity("Kolkata");
		user1.setStatus("I am a Java Programmer");
		

		User user2=new User();
		user2.setName("Nirupama Sarkar");
		user2.setCity("Balurghat");
		user2.setStatus("I am a Singer.");
		
		userRepo.save(user1);
		userRepo.save(user2);
		System.out.println(user2);
	}

}
