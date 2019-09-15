package com.springboot.view.model;

public class Employee {

	private long id;
	private String first_name;
	private String lastName;
	private String emailId;
	
	public Employee() {
		
	}
	
	public Employee(long id, String firstName, String lastName, String emailId) {
		this.id = id;
		this.first_name = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
