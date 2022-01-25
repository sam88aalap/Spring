package com.spring.autowire.annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int empId;
	private String empName;
	
//	@Autowired //autowiring byName
	private Address address;
	
	public Employee() {}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	@Autowired //byType
	@Qualifier (value="address2") // alternate to autowire candidate method in XML way
	public void setAddress(Address address) {
		System.out.println("Setter invoked");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	
	
}
