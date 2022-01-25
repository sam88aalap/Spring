package com.spring.training.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.training.beans.Student;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// Autowiring by name
		Student s = (Student) context.getBean("student");
		System.out.println(s);
	}

}
