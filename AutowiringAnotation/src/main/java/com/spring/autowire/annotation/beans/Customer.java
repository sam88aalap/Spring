package com.spring.autowire.annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	
	private int customerId;
	private String customerName;
	private Address address;
	
	@Autowired // Constructor
	
	public Customer(int customerId, String customerName, Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address + "]";
	}
	
}
