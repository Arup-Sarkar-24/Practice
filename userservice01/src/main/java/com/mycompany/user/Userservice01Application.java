package com.mycompany.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaServer
@EnableFeignClients
public class Userservice01Application {

	public static void main(String[] args) {
		SpringApplication.run(Userservice01Application.class, args);
	}
}
