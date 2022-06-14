package com.ashutosh.service;

public class OTPGenerator {
	
	public int getOTP() {
		
		int pin;
		
		//math.random gives double vales; 0.0<=math.random<1.0
		pin=(int) (Math.random()*9000+1000);
		
		return pin;
	}

}
