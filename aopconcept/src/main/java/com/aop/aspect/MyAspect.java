package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Aspect
public class MyAspect {

	@Before("excution(* com.aop.services.PaymentServiceImpl.makePayment())")
	public void printBefore() {
		System.out.println("Payment Started....");
	}
	
	@After("excution(* com.aop.services.PaymentServiceImpl.makePayment())")
	public void printAfter() {
		System.out.println("Payment Done....");
	}
}
