package com.spring.model;

import java.util.HashMap;

import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
	
	@NotNull(message = "required")
	
	@Size(min = 1 ,message ="required")
	private String fname ; 
	
	private String lname ; 

	@NotNull(message = "Required Field")
	@Min( value = 20 ,message="the age must be higher or equals 20")
	@Max( value = 50 ,message="the age must be lower or equals 50")
	private String age ;
	
	private String country ;
	
	@NotNull(message = "Required Field")
	@Pattern(regexp ="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"
			,message = "inavalid Email")
	private String email ;
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	private String[] player ; 
	
	public String[] getPlayer() {
		return player;
	}


	public void setPlayer(String[] player) {
		this.player = player;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public HashMap<String, String> getLanguagelist() {
		return languagelist;
	}


	public void setLanguagelist(HashMap<String, String> languagelist) {
		this.languagelist = languagelist;
	}

	private String language ; 

	
	private HashMap<String,String> countrylist ;
	private HashMap<String,String> languagelist ;
	
	public Student() {
		countrylist = new HashMap<>() ;
		countrylist.put("Egypt","EG");
		countrylist.put("France","FR");
		countrylist.put("Germany","GER");
		countrylist.put("UnitedStates","US");
		countrylist.put("UnitedArabEmirates","UAE");
		
		languagelist = new HashMap<>();
		languagelist.put("Java","Java");
		languagelist.put("C++","C++");
		languagelist.put("Python","Python");
		languagelist.put("Kotlin","Kotlin");
		languagelist.put("Dart","Dart");
		
		
	}
	
	
	public HashMap<String, String> getCountrylist() {
		return countrylist;
	}

	public void setCountrylist(HashMap<String, String> countrylist) {
		this.countrylist = countrylist;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	} 

	
	
	
}
