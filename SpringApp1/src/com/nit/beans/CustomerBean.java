package com.nit.beans;

public class CustomerBean {

	private String customerName;
	private String customerID;
	private String customerLocation;
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerLocation() {
		return customerLocation;
	}
	
	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}

	@Override
	public String toString() {
		return "CustomerBean [customerName=" + customerName + ", customerID=" + customerID + ", customerLocation="
				+ customerLocation + "]";
	}
	
	
	
	
}
