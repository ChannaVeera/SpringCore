package com.spring.classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher {

	public void teach() {
		System.out.println("im ur maths teacher ");
		System.err.println("My name is JokerHath");
		
	}

}
