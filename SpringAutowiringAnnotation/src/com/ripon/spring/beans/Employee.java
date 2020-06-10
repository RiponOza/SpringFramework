package com.ripon.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Employee {

	@Value("55")
	private int empId;

	@Value("Naresh")
	private String empName;

	@Autowired(required = false)
	@Qualifier("dept")
	private Department department;

	private Address address;

	// constructor
	@Autowired
	public Employee(Address address) {
		this.address = address;
	}

	// method
	public void doDepartmentInstantiation(Department department) {
		this.department = department;
	}

	// setters
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	// business logic
	public void displayEmployee() {
		System.out.println("Employee details :--> " + empId + "  " + empName + "\n");
		if (department != null) {
			department.displayDepartment();
		} else {
			System.out.println("No department info available.\n");
		}
		address.displayAddress();
	}

}
