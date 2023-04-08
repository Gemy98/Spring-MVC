package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String main() {
		return "mainpage" ; 
	}
	@RequestMapping("/profile")
	public String mainprofile() {
		return "test mvc controller" ; 
	}
	
}