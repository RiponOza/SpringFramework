package com.nit.beans;

public class EmployeeBean {
	
	// simple properties
	private int empId;
	private String empName;
	private String empDesignation;
	private float empSalary;
	private AddressBean employeeAddress;
	
	static {
		System.out.println("EmployeeBean Class static block.");
	}
	
	public void setEmployeeAddress(AddressBean employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	public AddressBean getEmployeeAddress() {
		return employeeAddress;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpDesignation() {
		return empDesignation;
	}
	
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
	public float getEmpSalary() {
		return empSalary;
	}
	
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", empDesignation=" + empDesignation
				+ ", empSalary=" + empSalary + ", address=" + employeeAddress + "]";
	}

	
	
	
}
