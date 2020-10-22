package com.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//when AnnotationConfigApplicationContext and SpringApplication will run then container
//will be created & which will carry only config.class items but here @Configuration
//will be inserted inside container despite of searching for config.class file

@Component
public class Person {
	
	@Autowired
	Food food;
	
	public void speak() {
		System.out.println("I am able to eat");
	}
	
	public void eat() {
		food.recipe();
	}
}
