package com.example.SmallWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmallWebAppApplication {

	public static void main(String[] args) {
		System.out.println("Hello-1");
		SpringApplication.run(SmallWebAppApplication.class, args);
		System.out.println("Hello-2");
	}

}
