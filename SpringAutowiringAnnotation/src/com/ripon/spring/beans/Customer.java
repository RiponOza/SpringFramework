package com.ripon.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private String customerId;
	private String customerName;

	public void setCustomarId(String customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	// business logic
	public void displayCustomer() {
		System.out.println("Customer detail :--> " + customerId + "  " + customerName + "\n");
	}

}
