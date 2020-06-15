package com.ripon.spring.beans;

public class TestBean {

	private int testId;
	private String testStatus;
	private Address address;

	public TestBean(int testId, String testStatus, Address address) {
		System.out.println("TestBean class perameterized constructor called ::::::::::::");
		this.testId = testId;
		this.testStatus = testStatus;
		this.address = address;
	}

	// business method ::::::::::::::::::::::::::::::::::
	public void displayTest() {
		System.out.println("TestId ::::"+testId);
		System.out.println("TestStatus ::::"+testStatus);
		System.out.println();
		address.displayAddress();
	}

}
