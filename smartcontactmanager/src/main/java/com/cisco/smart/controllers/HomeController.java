package com.cisco.smart.controllers;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.web.bind.annotation.ResponseBody;

//import com.cisco.smart.dao.UserRepository;
//import com.cisco.smart.entities.User;

@Controller
public class HomeController {
	
	/*
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		User user=new User();
		user.setName("Arup Sarkar");
		user.setEmail("arup.sarkar@aol.com");
		userRepository.save(user);
		return "working";
	}
	 
	 */
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/base")
	public String base() {
		return "base";
	}

}
