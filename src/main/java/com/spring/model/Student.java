package com.spring.model;

import java.util.HashMap;

public class Student {

	private String fname ; 
	
	private String lname ; 

	private String age ;
	
	private String country ; 

	
	private HashMap<String,String> countrylist ;
	
	public Student() {
		countrylist = new HashMap<>() ;
		countrylist.put("Egypt","EG");
		countrylist.put("France","FR");
		countrylist.put("Germany","GER");
		countrylist.put("UnitedStates","US");
		countrylist.put("UnitedArabEmirates","UAE");
		
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
