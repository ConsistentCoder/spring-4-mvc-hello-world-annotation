package com.consistentcoder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Main {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap model) {
	
		model.addAttribute("message", "Spring 4 MVC Hello World Example Built with Maven");
		return "hello";
	}
}
