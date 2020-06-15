package com.ripon.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ripon.spring.beans.Customer;
import com.ripon.spring.beans.SpringBeanPostProcessor;

@Configuration
public class AppConfig {

	@Bean(name = "cust", initMethod = "customInit", destroyMethod = "customDestroy")
	public Customer getCustomer() {
		System.out.println("Customer bean is instantiated:::::");
		Customer c = new Customer();
		c.setCustomerId(1);
		c.setCustomerName("Ripon");
		c.setCustomerLocation("Tezpur");
		System.out.println("Bean object population is done:::::");
		return c;
	}

	@Bean("PostProcessor")
	public SpringBeanPostProcessor getSpringBeanPostProcessor() {
		return new SpringBeanPostProcessor();
	}

}
