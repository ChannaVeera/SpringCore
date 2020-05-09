package com.spring.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Clint {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		College college = context.getBean("college", College.class);
		System.out.println("the college object is " + college);
		college.collegeinfo();
	}

}
