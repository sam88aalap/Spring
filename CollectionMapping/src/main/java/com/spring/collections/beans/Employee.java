package com.spring.collections.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private int empId;
	private String name;
	private String designation;
	private List<String> techStack;
	private Set<String> addresses;
	private Map<String,Integer> experience;
	
	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, Integer> getExperience() {
		return experience;
	}

	public void setExperience(Map<String, Integer> experience) {
		this.experience = experience;
	}

	public Employee() {}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<String> getTechStack() {
		return techStack;
	}

	public void setTechStack(List<String> techStack) {
		this.techStack = techStack;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + ", techStack="
				+ techStack + ", addresses=" + addresses + ", experience=" + experience + "]";
	}
	
	

}
