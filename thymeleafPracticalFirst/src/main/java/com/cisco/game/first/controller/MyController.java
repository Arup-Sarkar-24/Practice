package com.cisco.game.first.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MyController {
	
	//http://localhost:8080/about
	
	@GetMapping(value = "/about")
	public String about(Model model) {
		System.out.println("Inside about hendler");
		model.addAttribute("name", "Arup Sarkar");
		model.addAttribute("currentDate", new Date().toLocaleString());
		return "about";//show about.html page	
	}
	
	
	//handling iteration
	@GetMapping("/example-loop")
	public String iterateHandler(Model m) {
		System.out.println("Inside iterate handler.");
		List<String> names= List.of("Athav","Anand","Akash","Arijit","Tanmoy","Debarghya","Iswar","Gurmeet");
		m.addAttribute("names",names);
		return "iterate";
	}
	
	//handler for conditional statements
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		System.out.println("condtional executed.");
		m.addAttribute("isActive",true);
		m.addAttribute("gender", "F");
		List<Integer> list=List.of(2,3,5,7,11,13);
		m.addAttribute("myList", list);
		return "condition";
	}

}
