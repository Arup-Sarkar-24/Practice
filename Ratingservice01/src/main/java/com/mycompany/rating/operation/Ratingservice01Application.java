package com.mycompany.rating.operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaServer
public class Ratingservice01Application {

	public static void main(String[] args) {
		SpringApplication.run(Ratingservice01Application.class, args);
	}	

}
