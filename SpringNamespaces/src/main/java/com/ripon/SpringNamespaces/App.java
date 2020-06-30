package com.ripon.SpringNamespaces;

import java.util.List;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ripon.spring.beans.Student;


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

        Properties prop = (Properties) ac.getBean("properties");
        System.out.println(prop);
        
        System.out.println();
        
        List<String> list = (List<String>) ac.getBean("myList");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        
        
        
    }
}
