package com.example.MavenApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//It is combination of all the three below
@SpringBootApplication

//Don't need to create configuration class bcz it's auto
@EnableAutoConfiguration

//Inovoke all the class and package inside(com.example.MavenApp) that's not necessary to call HomeController class here
@ComponentScan

@SpringBootConfiguration
public class Main{

	public static void main(String[] args) {
		//TODO Auto-generated method stud
		
		ApplicationContext con = SpringApplication.run(Main.class, args);
		System.out.println("Hello I am Main");
	}
}
