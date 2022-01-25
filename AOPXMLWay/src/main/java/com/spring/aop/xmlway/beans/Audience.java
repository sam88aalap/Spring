package com.spring.aop.xmlway.beans;

public class Audience {

	// cross-cutting concerns
	public void takeSeats() {
		System.out.println("Audience seated....");
	}
	
	public void switchOffMobile() {
		System.out.println("Mobiles switched off....");
	}
	
	public void appreciatePerformance() {
		System.out.println("BRAVO!!!!");
	}
	
	public void demandRefund() {
		System.out.println("We want our money back");
	}
	
	public void goHome() {
		System.out.println("Audience go home");
	}
}
