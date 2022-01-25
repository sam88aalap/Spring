package com.spring.collections.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.collections.beans.Cart;
import com.spring.collections.beans.Customer;
import com.spring.collections.beans.Employee;
import com.spring.collections.beans.Student;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee e = (Employee) context.getBean("employee");
		System.out.println(e);
		
		Cart cart1 =(Cart) context.getBean("cart1");
		System.out.println(cart1);
		
		Cart cart2 =(Cart) context.getBean("cart2");
		System.out.println(cart2);
		
		Cart cart3 =(Cart) context.getBean("cart3");
		System.out.println(cart3);
		
		Customer c1 = (Customer) context.getBean("customer");
		System.out.println(c1);
		
		Student student = (Student) context.getBean("student1");
		System.out.println(student);
	}

}
