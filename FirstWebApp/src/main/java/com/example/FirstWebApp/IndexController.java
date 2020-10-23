package com.example.FirstWebApp;

import javax.servlet.http.HttpServletRequest;
//
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/url_index")
	public String function() {
		return "index";
	}
	
	@RequestMapping("/result")
	public String function(HttpServletRequest request) {
		System.out.println("value: "+request.getParamater("data"));
		return "result";
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
