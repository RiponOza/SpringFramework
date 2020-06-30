package com.ripon.SpringComponentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ripon.spring.bean.Address;
import com.ripon.spring.config.CustomerConfiguration;
import com.ripon.spring.service.AddressService;
import com.ripon.spring.service.CustomerService;

public class SpringClient 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfiguration.class);
    	
    	CustomerService cs = (CustomerService) context.getBean("customerService");
    	cs.addCustomerRecord("Rajdeep", 2007, "Dibrugarh");
    	
    	AddressService as = (AddressService) context.getBean("addressService");
    	as.addAddressRecord("Dibrugarh", "786023");
    }
}
