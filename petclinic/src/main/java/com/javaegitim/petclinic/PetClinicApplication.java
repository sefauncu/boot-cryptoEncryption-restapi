package com.javaegitim.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value=PetClinicProperties.class)
public class PetClinicApplication {
	//start project
	public static void main(String[] args) throws Exception {
		SpringApplication.run(PetClinicApplication.class, args);
	}
}
