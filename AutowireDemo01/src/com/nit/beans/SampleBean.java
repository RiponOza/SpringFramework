package com.nit.beans;

public class SampleBean {
	
	String status;
	
	TestBean tb;

	
	
	public SampleBean(String status, TestBean tb) {
		this.status = status;
		this.tb = tb;
	}



	public void showSampleBean() {
		tb.showTestBean();
		System.out.println(status);
	}

}
