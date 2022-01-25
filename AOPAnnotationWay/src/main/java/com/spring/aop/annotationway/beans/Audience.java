package com.spring.aop.annotationway.beans;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

	public Audience() {
		System.out.println("Audience class constructor");
	}
	
	@Pointcut("execution (* com.spring.aop.annotationway.beans.Performer.perform(..))")
	private void performance() {}  //dummy method to specify pointcut
	
	@Before(value="performance()")
	public void takeSeats() {
		System.out.println("Audience seated....");
	}
	
	@Before(value="performance()")
	public void switchOffMobile() {
		System.out.println("Mobiles switched off....");
	}
	
	@AfterReturning(value="performance()")
	public void appreciatePerformance() {
		System.out.println("BRAVO!!!!");
	}
	
	@AfterThrowing(value="performance()")
	public void demandRefund() {
		System.out.println("We want our money back");
	}
	
	@After(value="performance()")
	public void goHome() {
		System.out.println("Audience go home");
	}
}
