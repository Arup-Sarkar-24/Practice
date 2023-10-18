package com.mycompany.hotel.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Hotelservice01Application {

	public static void main(String[] args) {
		SpringApplication.run(Hotelservice01Application.class, args);
	}

}
