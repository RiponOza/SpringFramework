package com.ripon.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ripon.spring.bean.Address;
import com.ripon.spring.dao.AddressDao;

@Service("addressService")
public class AddressService {
	
	@Autowired
	private Address address;
	
	@Autowired
	private AddressDao addressDao;
	
	private String status;
	
	public void addAddressRecord(String cityName, String pinCode) {
		// populating Address object
		address.setCityName(cityName);
		address.setPinCode(pinCode);
		// inserting address object to database using Dao class methods
		status = addressDao.insertAddress(address);
		
		System.out.println(status);
	}

}
