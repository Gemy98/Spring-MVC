package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/process")
public class ProcessData {
	
	
	@RequestMapping("/signin")
	public String myLogin() {
		return "login" ; 
	}

}
