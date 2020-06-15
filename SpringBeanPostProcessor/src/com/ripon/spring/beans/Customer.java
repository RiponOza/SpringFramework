package com.ripon.spring.beans;

public class Customer {

	private int customerId;
	private String customerName;
	private String  customerLocation;

	// getters and setters
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerLocation() {
		return customerLocation;
	}
	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}
	
	//custom inti method
	public void customInit() {
		System.out.println("customInit() is called:::::::");
	}
	
	//custom destroy method
	public void customDestroy() {
		System.out.println("customDestroy() is called:::::::");
	}

	// business logic
	public void displayCustomer() {
		System.out.println("Customer details :::::: " + customerId + " " + customerName + " " + customerLocation);
	}


}

















