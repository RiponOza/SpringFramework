package com.ripon.spring.beans;

import org.springframework.beans.factory.annotation.Value;

public class Department {

	@Value("556")
	private int deptId;

	@Value("Information Technology")
	private String deptName;

	// setters
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	// business logic
	public void displayDepartment() {
		System.out.println("Dept detail :--> " + deptId + "  " + deptName + "\n");
	}
}
