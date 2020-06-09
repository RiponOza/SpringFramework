package com.nit.beans;

public class SampleBean {
	
	String status;
	
	TestBean tb;

	
	//constructor
	public SampleBean(String status, TestBean tb) {
		this.status = status;
		this.tb = tb;
	}


	// getters and setters
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public TestBean getTb() {
		return tb;
	}

	public void setTb(TestBean tb) {
		this.tb = tb;
	}


	// business method
	public void showSampleBean() {
		tb.showTestBean();
		System.out.println(status);
	}

}
