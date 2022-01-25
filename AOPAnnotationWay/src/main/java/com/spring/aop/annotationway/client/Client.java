package com.spring.aop.annotationway.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.annotationway.beans.Performer;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Performer performer = (Performer) context.getBean("performer");
		performer.perform();
	}
}
