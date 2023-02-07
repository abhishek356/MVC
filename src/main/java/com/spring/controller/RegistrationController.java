package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.User;

@Controller
public class RegistrationController {

	
	
	
	@ModelAttribute
	public void common(Model model)
	{
		System.out.println("common method is called");
		model.addAttribute("Header","Welcome User");
		
	}
	
	
	@RequestMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
	
//	@RequestMapping(path = "/processForm",method =RequestMethod.POST)
//	public String processForm(@RequestParam("email") String email,
//			                  @RequestParam("userName") String userName,
//			                  @RequestParam("password") String password, Model model) {
//		
//	model.addAttribute("userName",userName);
//	model.addAttribute("email", email);
//	model.addAttribute("password",password);
//	
//		
//		return "success";
//	}
	
	@RequestMapping(path ="/processForm", method = RequestMethod.POST)
	public String processForm(@ModelAttribute User user, Model model)
	{
		model.addAttribute("UserName",user.getUserName());
		model.addAttribute("email", user.getEmail());
		model.addAttribute("password",user.getPassword());
		return "success";
	}
	
}
