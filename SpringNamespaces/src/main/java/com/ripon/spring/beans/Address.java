package com.ripon.spring.beans;

public class Address {

	private String city;
	private long pin;

	// getters and setters
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	// business method ::::::::::::::::::::::::::::::::::
	public void displayAddress() {
		System.out.println("City name ::::" + city);
		System.out.println("PIN ::::" + pin);
	}

}
