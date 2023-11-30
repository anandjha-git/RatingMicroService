package com.lcwd.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RatingMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingMicroServiceApplication.class, args);
	}

}
