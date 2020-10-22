package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		
		ApplicationContext con = SpringApplication.run(Main.class, args);
		
		Person person = con.getBean(Person.class);	
		person.eat();
	}
}
