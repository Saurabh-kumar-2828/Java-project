package com.aop.services;

public class PaymentServiceImpl implements PaymentService{

	@Override
	public void makePayment() {

		// payment code
		System.out.println("Amount Debited.... ");
		
		
		System.out.println("Amount Creadited.. ");
	}

}
