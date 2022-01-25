package com.spring.training.beans;

public class Student {
	
	private int rollNo;
	private String name;
//	private float score;
	private ReportCard reportCard;
	private Address address;
	
	
	
	public Student(int rollNo, String name, ReportCard reportCard, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
//		this.score = score;
		this.reportCard = reportCard;
		this.address = address;
	}

	public ReportCard getReportCard() {
		return reportCard;
	}

	public void setReportCard(ReportCard reportCard) {
		this.reportCard = reportCard;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public float getScore() {
//		return score;
//	}
//	public void setScore(float score) {
//		this.score = score;
//	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ",  reportCard=" + reportCard
				+ ", address=" + address + "]";
	}
	
}
