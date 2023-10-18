package com.cisco.validation.master.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {
	@GetMapping("/exemple")
	public String exemple() {
		return "exemple";		
	}

}
