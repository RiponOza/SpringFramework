package com.ripon.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.ripon.spring.bean.Address;


@Repository("addressDao")
public class AddressDaoImpl implements AddressDao {

	@Autowired
	private MysqlDataSource datasource;
	
	private String status = null;
	
	public String insertAddress(Address address) {
		
		try {
			// get connection from connection pool
			Connection con = datasource.getConnection();
			// creating prepared statement to insert data into "address" table
			PreparedStatement pst = con.prepareStatement("INSERT INTO address VALUES(?, ?)");
			pst.setString(1, address.getCityName());
			pst.setString(2, address.getPinCode());
			// execution result stored in status
			status = pst.executeUpdate() > 0 ?"Address successfully inserted.":"Error occured....";
			
		}
		catch(Exception e) {
			e.printStackTrace();
			status = "Error occured....";
		}
		
		return status;
	}

}
