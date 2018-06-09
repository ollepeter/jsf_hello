package com.luv2cod.ejsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {
	private String firstName;
	private String lastName;
	private String country;
	
	// no-arg constructor
	public StudentTwo() {
		
	}

	// getter/setter method
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
