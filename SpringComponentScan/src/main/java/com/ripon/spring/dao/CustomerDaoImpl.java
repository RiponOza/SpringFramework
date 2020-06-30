package com.ripon.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.ripon.spring.bean.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDAO {

	@Autowired
	private MysqlDataSource datasource;
	
	private String status;
	
	public String insertCustomer(Customer customer) {
		
		try {
			Connection con = datasource.getConnection();
			PreparedStatement pst = con.prepareStatement("INSERT INTO customer VALUES(?, ?, ?)");
			pst.setString(1, customer.getCustomerName());
			pst.setLong(2, customer.getCustomerId());
			pst.setString(3, customer.getCustomerLocation());
			status = pst.executeUpdate() > 0 ? "Inserted successfully...":"Error Occured..." ;
			
		} catch (SQLException e) {
			e.printStackTrace();
			status = "Error Occured...";
		}

		return status;
	}

}
