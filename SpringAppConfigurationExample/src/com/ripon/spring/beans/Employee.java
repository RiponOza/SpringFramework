package com.ripon.spring.beans;

public class Employee {

	private String empId;
	private String empName;
	private Department department;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public void displayEmployee() {
		System.out.println("Employee details :--> " + empId + "  " + empName + "\n");
		department.displayDepartment();
	}

}
