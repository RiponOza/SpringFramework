package com.nit.beans;

public class AddressBean {

	private String doorNo;
	private String streetName;
	private String cityName;
	
	static {
		System.out.println("Address Class static block.");
	}
	
	// constructor
	public AddressBean(String doorno, String streetName, String cityName) {
		doorNo = doorno;
		this.streetName = streetName;
		this.cityName = cityName;
	}



	@Override
	public String toString() {
		return "AddressBean [doorNo=" + doorNo + ", streetName=" + streetName + ", cityName=" + cityName + "]";
	}
	
	
}
