package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.controller","com.bean","com.service"})
public class Validation1Application {

	public static void main(String[] args) {
		SpringApplication.run(Validation1Application.class, args);
	}

}
