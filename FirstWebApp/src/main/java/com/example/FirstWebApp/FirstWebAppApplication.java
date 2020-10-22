package com.example.FirstWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstWebAppApplication {

	public static void main(String[] args) {
		System.out.println("Hello-1");
		SpringApplication.run(FirstWebAppApplication.class, args);
		System.out.println("Hello-2");
	}
}
