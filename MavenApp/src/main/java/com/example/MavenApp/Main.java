package com.example.MavenApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication

@EnableAutoConfiguration
@ComponentScan
@SpringBootConfiguration
public class Main{

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
