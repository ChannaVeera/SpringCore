package com.spring.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class College {

	// Autowired Annotation to inject Dependency into college object

	@Autowired
	private Principle principle;
	
	
	
	/*If interface consist of more then 1 impel class we  will get an exception  like ( available: expected single matching bean but found 2: 
	 * mathTeacher,scienceTeacher) 
	 * Note mathTeacher  and scienceTeacher are two impel class 
	 * to avoide such exception we us annotation like @primary and @qualifier
	 * note : @primary is user class level
	 */
	@Autowired
//	@Qualifier("scienceTeacher")
	private Teacher teacher;

	// u can use this constructer College in order to inject the bean(principle)
	// object as DI
	/*
	 * public College( Principle principle) { this.principle = principle;
	 * System.out.println("Consturcter");
	 * 
	 * }
	 */
	// by using setter we can inject the object into it
	public void setPrinciple(Principle principle) {
		this.principle = principle;
	}

	public void collegeinfo() {
		System.out.println("College info is");
		principle.prsnlinfo();
		teacher.teach();
	}

}
