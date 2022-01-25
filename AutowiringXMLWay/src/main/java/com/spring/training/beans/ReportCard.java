package com.spring.training.beans;

public class ReportCard {
	
	private int score;
	private String grade;
	
	public ReportCard(int score, String grade) {
		
		this.score = score;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "ReportCard [score=" + score + ", grade=" + grade + "]";
	}
	
	

}
