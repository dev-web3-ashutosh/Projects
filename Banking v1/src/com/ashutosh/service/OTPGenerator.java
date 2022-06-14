package com.ashutosh.service;

public class OTPGenerator {
	
	public int getOTP() {
		
		int pin;
		
		pin=(int) (Math.random()*9000+1000);
		
		return pin;
	}

}
