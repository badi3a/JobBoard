package com.esprit.microservice.condidature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CondidatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(CondidatureApplication.class, args);
	}

}
