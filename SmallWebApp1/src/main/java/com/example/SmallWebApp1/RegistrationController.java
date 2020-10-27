package com.example.SmallWebApp1;
//package dao;

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
	
	@RequestMapping("/userDetail")
	public String userInfo(UserRegistration reg) {
		//saving data coming from client(registration.jsp)
		repo.save(reg);
		System.out.println("UserDetails is triggered");
		return "operation";
	}
	
	@RequestMapping("/operation1")
	public ModelAndView operation(Long UID, String ddlFlag) {
		
		System.out.println("Operation is triggered");
		
		if(ddlFlag.equals("select")) {
			System.out.println(ddlFlag);
			
			UserRegistration reg = repo.findById(UID).orElse(new UserRegistration());
			return selectRecords(reg);
		}
		else if(ddlFlag.equals("delete")) {
			repo.deleteById(UID);
			System.out.println(ddlFlag);
		}
		else if(ddlFlag.equals("update")) {
			UserRegistration reg = repo.findById(UID).orElse(new UserRegistration());
			reg.setUName("xyz-new-name-is-updated");
			repo.save(reg);
			System.out.println(ddlFlag);
		}
		else {
			System.out.println(repo.selectRecordByName("yaman"));
		}
		return new ModelAndView("operation");
	}
	
	public ModelAndView selectRecords(UserRegistration reg) {
		
		ModelMap model = new ModelMap();
		model.put("name", reg.getUName());
		model.put("email", reg.getEmailId());
		model.put("gender", reg.getGender() == Integer.parseInt("1") ? "Male" : "Female");
		
		ModelAndView mv = new ModelAndView("user-details");
		mv.addObject("regObj", model);
		return mv;
	}
}
