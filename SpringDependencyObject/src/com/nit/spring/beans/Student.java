package com.nit.spring.beans;

public class Student {

	private String studentID;
	private String studentName;
	private String studentEmail;
	private Course studentCourse;
	
	public Student() {
		System.out.println("Student class default Constructor called !!!!\n");
	}
	
	public Student(String studentID, String studentName, String studentEmail, Course studentCourse) {
		System.out.println("Student class perameterised Constructor called !!!!\n");
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentCourse = studentCourse;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentCourse=" + studentCourse + "]\n";
	}
	
}

