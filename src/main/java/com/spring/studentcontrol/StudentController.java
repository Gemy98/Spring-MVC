package com.spring.studentcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.Student;

@Controller
@RequestMapping("student")
public class StudentController {
	
	@RequestMapping("/account")
	public String studentform () {
		
		
		return "student-front/student-account";
	}
	
	@RequestMapping("/studentprocess")
	public String getDataStudent(@RequestParam("sfname") String fname,
			@RequestParam("slname") String lname,
			@RequestParam("sage") String age,
			Model model 
			) {
			Student student = new Student();
			student.setFname(fname);
			student.setLname(lname);
			student.setAge(age);
			model.addAttribute("myStudent",student);
		
		return "student-front/showdatastudent";
	}
	
}
