package com.spring.autowire.annotation.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.autowire.annotation.beans.Customer;
import com.spring.autowire.annotation.beans.Employee;

public class Client {
	public static void main(String[] args) {
		
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee e = (Employee) context.getBean("employee");
		System.out.println(e);
		
		Customer c = (Customer) context.getBean("customer");
		System.out.println(c);

	}

}
