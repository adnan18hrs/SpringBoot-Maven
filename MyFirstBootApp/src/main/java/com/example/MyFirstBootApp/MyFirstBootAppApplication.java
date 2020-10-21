package com.example.MyFirstBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstBootAppApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(MyFirstBootAppApplication.class, args);
	}

}
