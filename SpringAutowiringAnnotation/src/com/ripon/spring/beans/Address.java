package com.ripon.spring.beans;

import org.springframework.beans.factory.annotation.Value;

public class Address {

	@Value("3")
	private String doorNo;
	@Value("NH32")
	private String streetName;
	@Value("TEzpur")
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
