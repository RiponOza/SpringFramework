package com.ripon.spring.beans;

import org.springframework.beans.factory.annotation.Value;

public class Department {

	@Value("556")
	private int deptId;

	@Value("Information Technology")
	private String deptName;

	// business logic
	public void displayDepartment() {
		System.out.println("Dept detail :--> " + deptId + "  " + deptName + "\n");
	}
}
