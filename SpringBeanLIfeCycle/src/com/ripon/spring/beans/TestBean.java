package com.ripon.spring.beans;

public class TestBean {

	private int a;
	
	// setter
	public void setA(int a) {
		this.a = a;
	}
	
	// getter
	public int getA() {
		return a;
	}
	
	//custom initialization method
	public void customInit() {
		a = 10;
	}

	// custom destroy method
	public void customDestroy() {
		System.out.println("customDestroy() is called....");
	}
}
