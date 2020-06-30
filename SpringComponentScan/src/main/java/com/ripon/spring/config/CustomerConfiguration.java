package com.ripon.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.ripon.spring.bean.Address;
import com.ripon.spring.bean.Customer;
import com.ripon.spring.dao.CustomerDAO;
import com.ripon.spring.dao.CustomerDaoImpl;
import com.ripon.spring.service.CustomerService;

@Configuration
@ComponentScan(basePackages = "com.ripon.spring.*")
public class CustomerConfiguration {
	
	@Bean
	public MysqlDataSource dataSouerce() {
		
		MysqlDataSource datasource = null;
		
		try {
			datasource = new MysqlDataSource();
			datasource.setUrl("jdbc:mysql://localhost:3306/Customer");
			datasource.setUser("ripon");
			datasource.setPassword("Brookian420@");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return datasource;
		
	}
	
	
//	@Bean
//	public CustomerDAO getCustomerDAO() {
//		return new CustomerDaoImpl();
//	}
//	
//	@Bean
//	public CustomerService getCustomerService() {
//		return new CustomerService();
//	}
//	
//	@Bean
//	public Customer getCustomer() {
//		return new Customer();
//	}

}






