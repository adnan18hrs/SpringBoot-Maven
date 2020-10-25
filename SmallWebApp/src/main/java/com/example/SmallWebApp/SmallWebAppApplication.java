package com.example.SmallWebApp;
//package dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class SmallWebAppApplication {

	public static void main(String[] args) {
		System.out.println("Hello-1");
		SpringApplication.run(SmallWebAppApplication.class, args);
		System.out.println("Hello-2");
	}

}
