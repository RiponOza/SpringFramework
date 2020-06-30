package com.ripon.spring.validator;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nit.spring.bean.Employee;


public class EmployeeValidator implements Validator {

	private Resource resource;
	
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	public boolean supports(Class<?> clazz) {
		return Employee.class.equals(clazz);
	}

	
	public void validate(Object obj, Errors errors) {
		
		try {
			Properties props = PropertiesLoaderUtils.loadProperties(resource);
			
			Employee employee = (Employee) obj;
			
			//validation logic
			
			if(employee.getEmployeeId()==null || employee.getEmployeeId().length()==0) {
				errors.rejectValue("employeeId", props.getProperty("error.employeeId.empty"));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
