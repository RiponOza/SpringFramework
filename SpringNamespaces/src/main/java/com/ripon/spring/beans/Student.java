package com.ripon.spring.beans;

public class Student {

	private int studentId;
	private String studentName;
	private TestBean testBean;

	// getters and setters=======================================
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}

	public TestBean getTestBean() {
		return testBean;
	}

	// business method =========================================
	public void displayStudent() {
		System.out.println("Student Name ::::" + studentName);
		System.out.println("Student ID ::::" + studentId);
		System.out.println();
		testBean.displayTest();
	}

}
