package com.example.FirstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {
	
	@RequestMapping("/url_index")
	public String function() {
		return "index";
	}
	/*
	@RequestMapping("/url_index1")
	public String function1() {
		return "index1";
	}
	System.out.println("kjasd");
	@RequestMapping("/url_index2")
	public String function2() {
		return "index2";
	}
	
	@RequestMapping("/url_index3")
	public String function3() {
		return "index3";
	}
	*/
}
