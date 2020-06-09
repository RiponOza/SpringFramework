package com.nit.spring.beans;

public class Course {

	private String courseId;
	private String courseName;
	private String courseFee;
	private TestBean test;
	
	//getters and setters
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(String courseFee) {
		this.courseFee = courseFee;
	}
	
	// business method
	public void displayCourse() {
		System.out.println("Course detials :---> " + courseId + "  "  + courseFee + "  " + courseName + "  " + "\n");
	}
	
}
