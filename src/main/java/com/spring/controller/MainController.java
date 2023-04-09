package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// default mapping 

public class MainController {
	@RequestMapping("/")
	public String main() {
		return "mainpage" ; 
	}
	@RequestMapping("/profile")
	public String mainprofile() {
		return "myprofile" ; 
	}
	
	/*@RequestMapping("/signin")
	public String myLogin() {
		return "login" ; 
	}
	*/
	@RequestMapping("/loginprocess")
	public String formProcess(HttpServletRequest request , Model model) {
		String username = request.getParameter("user") ; 
		String password = request.getParameter("pass") ; 
		username =" ( " + "username : "+  username.toUpperCase()+" ) ";
		password =" ( " + "username : "+  password.toUpperCase()+" ) ";
		model.addAttribute("username",username);
		model.addAttribute("password",password);
		return "loginprocess" ; 
	}
	
	
	
}
