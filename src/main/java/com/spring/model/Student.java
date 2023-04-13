package com.spring.model;

import java.util.HashMap;

public class Student {

	private String fname ; 
	
	private String lname ; 

	private String age ;
	
	private String country ; 
	
	
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
