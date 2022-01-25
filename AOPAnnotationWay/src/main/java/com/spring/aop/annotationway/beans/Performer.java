package com.spring.aop.annotationway.beans;

import org.springframework.stereotype.Component;

@Component("performer") //annotation to create object for class
public class Performer {

	public Performer() {
		System.out.println("Performer class constructor");
	}
	
	public void perform() {
		System.out.println("Performer is performing");
	}
}
