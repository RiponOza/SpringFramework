package com.nit.spring.beans;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class SimpleBean {

	private String[] cities;
	private List<String> courseList;
	private Date date;
	private Set<String> empId;
	private Map<Integer,String> empInfo;
	private Properties databaseDetails;

	// constructor
	public SimpleBean(String[] cities, List<String> courseList, Date date, Set<String> empId,
			Map<Integer, String> empInfo, Properties databaseDetails ) {
		this.cities = cities;
		this.courseList = courseList;
		this.date = date;
		this.empId = empId;
		this.empInfo = empInfo;
		this.databaseDetails = databaseDetails;
	}

	public void displayDate() {
		System.out.println("\nDate : " + date );
	}
	
	public void displayCitis() {
		System.out.println("\nCities are : ");
		for(String a : cities) {
			System.out.println(a);
		}
	}
	
	public void displayCourseList() {
		System.out.println("\nCourses are : ");
		for(String a : courseList) {
			System.out.println(a);
		}
	}
	
	public void displayEmpId() {
		System.out.println("\nEmployee Ids are : ");
		for(String a : empId) {
			System.out.println(a);
		}
	}
	
	public void displayEmpInfo() {
		System.out.println(empInfo + "\n");
	}
	
	public void displayDatabaseDetails() {
		System.out.println(databaseDetails + "\n");
	}
	
}

