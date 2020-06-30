package com.ripon.SpringBeanValidation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;

import com.nit.spring.bean.Employee;
import com.ripon.spring.validator.EmployeeValidator;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        
        Employee employee = (Employee) context.getBean("employee");
        
        EmployeeValidator validator = (EmployeeValidator) context.getBean("employeeValidator");
   
        Map<String, String> map = new HashMap<String, String>();
        
        MapBindingResult result = new MapBindingResult(map, "com.ripon.spring.bean.Employee")
        
        validator.validate(result, errors);
    
    }
}
