package com.ripon.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String employeeId;
	private String employeeName;

	// getters and setters
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	// business method ( this method definition will be replaced)
	public void displayEmployee() {
		System.out.println("Employee Id ::: "+employeeId);
		System.out.println("Employee Name ::: "+employeeName);
	}
}
