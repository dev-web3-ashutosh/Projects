package com.ashutosh.service;

import java.util.Scanner;

public class Banking {
	
	float balance=0;
	int amount;
	Scanner sc = new Scanner(System.in);
	OTPGenerator otpObj = new OTPGenerator();
	
	public void deposit() {
		System.out.println("Enter the amount to deposit");
		amount=sc.nextInt();
		
		if(amount>0) {
			balance += amount;
			System.out.println("Rs. " + amount + " deposited successfully");
			System.out.println("Available balance: " + getBalance());
		}
		else {
			System.out.println("Please enter a valid amount");
		}
	}
	
	public void withdrawal() {
		System.out.println("Enter the amount to withdraw");
		amount=sc.nextInt();
		
		if(balance-amount>=0) {
			balance -= amount;
			System.out.println("Rs. " + amount + " withdrawn successfully");
			System.out.println("Available balance: " + getBalance());
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	public void transfer() {
		
		int otp, otpGenerated;
		long accNo;
		
		otpGenerated = otpObj.getOTP();
		System.out.println("Your OTP is: " + otpGenerated);
		
		System.out.println("Enter OTP");
		otp=sc.nextInt();
		
		if(otp == otpGenerated) {
			
		}
		else {
			System.out.println("Invalid OTP");
		}
	}
	
	public float getBalance() {
		return balance;
	}

}
