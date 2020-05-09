package com.spring.classes;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	public void teach() {
		System.out.println("im ur science teacher ");
		System.err.println("My name is Dr murthy");
	}

}
