package com.spring.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class HomeController {

	
	
	
	
	@RequestMapping(value="/home")
	public String home(Model model)
	{  
		String name = "abhishek";
		model.addAttribute("key",name);
		
		System.out.println("Inside home method");
		return "home";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
	
		ModelAndView modelAndview = new ModelAndView();
		
		String name = "abhishek";
		modelAndview.addObject("name","abhishek");
		modelAndview.setViewName("help");

	//	LocalDateTime now = new LocalDateTime.now();
		return modelAndview;
		
	}
}
