package com.ripon.SpringMethodReplacement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ripon.spring.beans.Employee;

public class SpringClient 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        
        Employee employee = (Employee) context.getBean("emp");
        employee.displayEmployee();
    }
}
