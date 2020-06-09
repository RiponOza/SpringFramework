package com.nit.beans;

public class TestBean {
	
	private String test;
	
	// constructor
	public TestBean(String test) {
		this.test = test;
	}

	// getters and setters
	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}


	// business method
	public void showTestBean() {
		System.out.println(test);
	}
}
