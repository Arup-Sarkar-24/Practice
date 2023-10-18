package com.mycompany.springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url.");
		model.addAttribute("name", "Arup Sarkar");
		model.addAttribute("id", 1845);
		List<String> friends = new ArrayList<String>();
		friends.add("Anand");
		friends.add("Atharv");
		friends.add("Arup");
		friends.add("Tanmoy");
		friends.add("Iswar");
		friends.add("Bittu");
		friends.add("Gagan");
		model.addAttribute("f", friends);
		return "home";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller.");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Uttam");
		modelAndView.addObject("rollNo", 1845);
		// marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(80);
		list.add(50);
		list.add(70);
		list.add(90);
		modelAndView.addObject("marks", list);
		modelAndView.setViewName("help");
		return modelAndView;
	}

	@RequestMapping("/help2")
	public ModelAndView help2() {
		System.out.println("this is help2 controller.");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Uttam Khan");
		modelAndView.addObject("rollNo", 1845);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		// marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(80);
		list.add(50);
		list.add(70);
		list.add(90);
		modelAndView.addObject("marks", list);
		modelAndView.setViewName("help2");
		return modelAndView;
	}
}
