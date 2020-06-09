package com.ripon.spring.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ripon.spring.beans.Department;
import com.ripon.spring.beans.Employee;

@Configuration
public class SpringConfigApp {

	@Bean(name = {"emp", "employee"}, autowire = Autowire.BY_NAME)
	//@Scope("prototype")
	public Employee getEmployee() {
		Employee e = new Employee();
		e.setEmpId("3342645");
		e.setEmpName("Ripon Oza");
		//e.setDepartment(giveDepartment());
		return e;
	}

	@Bean(name = "department")
	// name of the method can be anything
	public Department giveDepartment() {
		Department d = new Department("DEPT5543", "Information Technology");
		return d;
	}
}
