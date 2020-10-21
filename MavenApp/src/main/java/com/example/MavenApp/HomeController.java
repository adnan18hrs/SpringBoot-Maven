package com.example.MavenApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/Home")
	public String home() {
		return "Hello home page !!";
	}
	
	@RequestMapping("/About")
	public String about() {
		return "Hello About-US !!";
	}
}
