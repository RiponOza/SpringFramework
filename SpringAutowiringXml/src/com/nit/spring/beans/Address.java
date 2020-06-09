package com.nit.spring.beans;

public class Address {

	private String streetName;
	private String cityName;
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public void displayAddress() {
		System.out.println("Address detials :---> " + streetName + "  " + cityName + "\n");
	}
	
}

