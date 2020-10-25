package com.example.SmallWebApp;
//package dao;

//import com.example.SmallWebApp.dao.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RegistrationController {
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/regforms")
	public String register() {
		System.out.println("Register is triggered");
		return "registration";
	}
	
//	@RequestMapping("/userDetail")
//	public ModelAndView userInfo(UserRegistration reg) {
//		System.out.println("userDetails is triggered");
//		
//		//ModelMap is a class
//		ModelMap model = new ModelMap();
//		model.addAttribute("name", reg.getUName());
//		model.addAttribute("email", reg.getEmailId());
//		model.addAttribute("gender", reg.getGender() == Integer.parseInt("1") ? "Male" : "Female");
//		model.addAttribute("name", reg.getUName());
//		model.addAttribute("hobbies", reg.getHobby());
//		
//		//ModelAndView is a controller return object & view as a single entity
//		ModelAndView mv = new ModelAndView("/user-details");
//		//tranfersing data from model to regObj
//		mv.addObject("regObj", model);
//		
//		return mv;
//	}
	
	@RequestMapping("/userDetail")
	public String userInfo(UserRegistration reg) {
		//saving data coming from client(registration.jsp)
		repo.save(reg);
		System.out.println("UserDetails is triggered");
		return "operation";
	}
	
	@RequestMapping("/operation")
	public String operation() {
		System.out.println("Operation is triggered");
		return "operation";
	}
}
