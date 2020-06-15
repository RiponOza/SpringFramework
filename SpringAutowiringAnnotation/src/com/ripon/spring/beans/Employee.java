package com.ripon.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Employee {

	@Value("55")
	private int empId;

	@Value("Naresh")
	private String empName;

	@Autowired // autowiring with fields
	private Department empDepartment;

	@Autowired(required = false)
	@Qualifier("address1") // address1 is the id of the requested bean
	private Address empAddress;

	private Customer customer;

	// constructor
	@Autowired
	public Employee(Customer customer) {
		this.customer = customer;
	}

	// business logic
	public void displayEmployee() {
		System.out.println("Employee details :--> " + empId + "  " + empName + "\n");
		if (empDepartment != null) {
			empDepartment.displayDepartment();
		} else {
			System.out.println("No department info available.\n");
		}
		empAddress.displayAddress();
		customer.displayCustomer();
	}

}
