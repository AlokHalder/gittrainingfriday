package com.training.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeInfoController {
	
		
	@RequestMapping("/")
	public String home() {
		
		System.out.println(" Inside Controller");
		
		return "index.jsp";
	}

}
