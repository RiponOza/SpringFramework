package com.ripon.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ripon.spring.bean.Customer;
import com.ripon.spring.dao.CustomerDAO;


@Service("customerService")
public class CustomerService {
	
	@Autowired
	private CustomerDAO dao;
	
	@Autowired
	private Customer customer;
	
	// service method
	public void addCustomerRecord(String customerName, long customerId, String customerLocation) {
		// creating customer bean object
		//Customer customer = new Customer();
		customer.setCustomerName(customerName);
		customer.setCustomerId(customerId);
		customer.setCustomerLocation(customerLocation);
		
		// insert customer object in database
		String status = dao.insertCustomer(customer);
		// printing status info
		System.out.println(status);
	}
	
	

}
