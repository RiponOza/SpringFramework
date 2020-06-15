package com.ripon.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.ripon.spring.beans.Customer;

public class SpringBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		Customer c = null;
		if(bean instanceof Customer) {
			System.out.println("postProcessBeforeInitialization() is called. ");
			c = new Customer();
			c = (Customer) bean;
			c.setCustomerId(11);
		}
		return c;
		
	}


	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		Customer c = null;
		if(bean instanceof Customer) {
			System.out.println("postProcessAfterInitialization() is called. ");
			c = new Customer();
			c = (Customer) bean;
			c.setCustomerId(11);
			}
		return c;
	}
}


