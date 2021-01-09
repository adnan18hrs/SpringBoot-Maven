package com.example.FirstWebApp;
//From VSC inside NewBranch now trying to merge them into master branch
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping("/url_index")
	public String function() {
		System.out.println("URL_INDEX is triggered");
		return "index";//will search for index.jsp
	}
	
	//for more than one variable(data) it is suitable
//	@RequestMapping("/url_result")
//	public String function(HttpServletRequest request) {
//		System.out.println("URL_RESULT is triggered..");
//		System.out.println("value: "+request.getParameter("data"));
//		HttpSession session = request.getSession();
//		session.setAttribute("value",request.getParameter("data"));
//		return "result";
//	}
	
	//this is suitable for only one data 	
//	@RequestMapping("/url_result")
//	public String function(@RequestParam("abc") String data,HttpSession session) {
//		System.out.println("URL_RESULT is triggered..");
//		System.out.println("Data is "+data);
//		session.setAttribute("value",data);
//		return "result";
//	}
	
//	//1st METHOD(By using Model class)
//	@RequestMapping("/url_result")
//	public String function(@RequestParam("myvalue") String data, Model model) {
//		System.out.println("URL_RESULT is triggered..");
//		model.addAttribute("value", data);
//		return "result";
//	}

//	//2nd METHOD(By using ModelAndView)..HashMap is used
//	@RequestMapping("/url_result")
//	public ModelAndView function(@RequestParam("myvalue") String data) {
//		System.out.println("URL_RESULT is triggered..");
//		
//		Map<String, String> map = new HashMap<String, String>();
//		//String myowndata = "10000";
//		map.put("value", data);
//		
//		return new ModelAndView("result",map);
//		
//	}
	

	//3rd METHOD(By using ModelAndView)..object is used in ModelAndView
	@RequestMapping("/url_result")
	public ModelAndView function(@RequestParam("myvalue") String data) {
		System.out.println("URL_RESULT is triggered..");
		
		ModelAndView mv = new ModelAndView("/result");
		mv.addObject("value",data);
		return mv;
	}
}
