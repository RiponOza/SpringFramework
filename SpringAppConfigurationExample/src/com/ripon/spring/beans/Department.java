package com.ripon.spring.beans;

public class Department {

	private String deptId;
	private String deptName;

	public Department(String deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public void displayDepartment() {
		System.out.println("Dept detail :--> " + deptId + "  " + deptName + "\n");
	}
}
