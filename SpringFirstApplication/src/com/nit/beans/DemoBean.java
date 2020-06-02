package com.nit.beans;

public class DemoBean {

	private String message;
	
	// Spring Container will inject in this setter method
	public void setMessage(String message) {
		System.out.println("This setter method of DemoBean class.");
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	// This is buisness logic
	public void displayMessage() {
		System.out.println("Message :::::::" + message);
	}
	
	
}
