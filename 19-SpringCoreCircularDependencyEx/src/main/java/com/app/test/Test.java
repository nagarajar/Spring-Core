package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Employee;

public class Test 
{
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Employee eob1 = ac.getBean("e1", Employee.class);
		System.out.println(eob1);
	}
}
