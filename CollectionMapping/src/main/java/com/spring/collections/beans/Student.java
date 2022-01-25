package com.spring.collections.beans;

import java.util.List;

public class Student {
	private int rollNo;
	private String name;
	private List<Integer> marks;
	public Student(int rollNo, String name, List<Integer> marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
