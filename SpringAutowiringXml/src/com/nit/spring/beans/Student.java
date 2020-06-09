package com.nit.spring.beans;

public class Student {

	private int studentId; // simple property
	private String studentName; // simple property
	
	private Course course; // object property(Autowire)
	private Address address; // object property(Autowire)
	
	
	
	public Student(int studentId, String studentName, Course course, Address address) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.address = address;
	}



	public void displayStudentInfo() {
		System.out.println("Student detials :---> " + studentId + "  " + studentName + "\n" );
		course.displayCourse();
		address.displayAddress();
	}
	
}
