package com.ripon.spring.beans;

public class DemoBean {

	private String message;

	// deafult costructor
	public DemoBean() {
		System.out.println("Default constructor is called.....");
	}

	static {
		System.out.println("static block is called.....");
	}

	// setter methods
	public void setMessage(String message) {
		System.out.println("setter is called....");
		this.message = message;
	}

	// getter
	public String getMessage() {
		return message;
	}

	// custom initialization method
	public void customInit() {
		message = "message is overriden by customInit()";
		System.out.println("customInit() called......");
	}

	// custom destroy method
	public void customDestroy() {
		System.out.println("customDestroy() is called....");
	}
}
