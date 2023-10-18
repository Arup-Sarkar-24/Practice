package com.mycompany.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.springmvc.model.User;
import com.mycompany.springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header"," Arup Sarkar");
		m.addAttribute("Desc","home for chess player...");	
		System.out.println("Adding common data to model.");
	}
	@RequestMapping("/contact")
	public String showForm(Model m) {
		System.out.println("creating form");
		return "contact";
	}
	/*
	 //old process
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String handleForm( HttpServletRequest request) {
		String email=request.getParameter("email");
		System.out.println("User email is : "+email);
		
		return "";
	}*/
	/*
	//using requestParam
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("userName") String userName ,
			@RequestParam("email") String userEmail ,
			@RequestParam("password") String userPassword, Model model) 
	{
		System.out.println("User name : "+userName);
		System.out.println("User email : "+userEmail);
		System.out.println("User password : "+userPassword);
		model.addAttribute("name",userName);
		model.addAttribute("email",userEmail);
		model.addAttribute("password",userPassword);
		return "success";
	}*/
		
	@RequestMapping(path="/processform",method = RequestMethod.POST) 
	public String handleForm(@ModelAttribute User user,Model model) {
		System.out.println("showing user data : ");
		System.out.println(user);
		model.addAttribute("User",user);
		int createUser = this.userService.createUser(user);
		model.addAttribute("msg","User created with id "+createUser);
		return "success";
	}

}
