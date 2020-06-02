package com.nit.spring.beans;

import java.util.Date;

public class Course {

	private String courseId;
	private int courseCost;
	private String courseList[];
	private Date date;
	
	public Course() {
		System.out.println("Course class default Constructor called !!!!\n");
	}

	public Course(String courseId, int courseCost, String[] courseList, Date date) {
		System.out.println("Course class perameterised Constructor called !!!!\n");
		this.courseId = courseId;
		this.courseCost = courseCost;
		this.courseList = courseList;
		this.date = date;
	}

	public void displayCourseList() {
		System.out.println("Enrolled courses are :--> ");
		for(String temp : courseList) {
			System.out.println(temp);
		}
		System.out.println(date);
	}

	
}
