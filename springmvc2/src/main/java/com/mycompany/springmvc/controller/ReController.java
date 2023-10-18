package com.mycompany.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	@RequestMapping("/one")
	public String one() {
		System.out.println("This is one handler");
		return "redirect:two";
	}
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is two handler");
		return "contact";
	}
	
	
	@RequestMapping("/trhee")
	public RedirectView three() {
		RedirectView redirectView= new RedirectView();
		redirectView.setUrl("two");
		System.out.println("This is three handler");
		return redirectView;
	}
	
	@RequestMapping("/four")
	public RedirectView four() {
		RedirectView redirectView= new RedirectView();
		redirectView.setUrl("https://www.google.com");
		System.out.println("This is four handler");
		return redirectView;
	}
	

}
