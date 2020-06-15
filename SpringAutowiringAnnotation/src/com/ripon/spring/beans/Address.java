package com.ripon.spring.beans;

import org.springframework.beans.factory.annotation.Value;

public class Address {

	private String doorNo;
	private String streetName;
	private String cityName;

	// setters
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void displayAddress() {
		System.out.println("Address --> " + doorNo + "  " + streetName + "  " + cityName + "\n");
	}

}
