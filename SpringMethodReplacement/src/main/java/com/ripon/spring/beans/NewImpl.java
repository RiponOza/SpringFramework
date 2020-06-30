package com.ripon.spring.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

@Component("newImpl")
public class NewImpl implements MethodReplacer {

	// this method will replace a method definition given in the xml file.
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		
		System.out.println("Method definition is replaced successfully .......");
		System.out.println("Employee Id(Reimplement, Replaced Value) :::: NIT-2001");
		System.out.println("Employee Name(Reimplement, Replaced Value) :::: Ripon");
		return null;
	}

}
