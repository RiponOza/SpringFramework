package com.ripon.SpringNamespaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ripon.spring.beans.*;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        
        Student stu = (Student) ac.getBean("student");
        
//        TestBean test = (TestBean) ac.getBean("test");
        
        stu.displayStudent(); 
        
        System.out.println();
        
//        test.displayTest();
        
    }
}
