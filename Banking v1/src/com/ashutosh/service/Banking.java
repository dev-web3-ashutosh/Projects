package com.ashutosh.service;

import java.util.Scanner;

public class Banking {
	
	float balance=0;
	Scanner sc = new Scanner(System.in);
	OTPGenerator otpObj = new OTPGenerator();
	
	public void deposit() {
		int amount;
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
		int amount;
		System.out.println("Enter the amount to withdraw");
		amount=sc.nextInt();
		
		if(balance-amount>=0) {
			balance -= amount;
			System.out.println("Rs. " + amount + " withdrawn successfully");
			System.out.println("Available balance: " + getBalance());
		}
		else {
			System.out.println("Insufficient funds");
		}
	}
	
	public void transfer() {
		
		int otp, otpGenerated;
		float amount;
		long accNo;
		
		otpGenerated = otpObj.getOTP();
		System.out.println("Your OTP is: " + otpGenerated);
		
		System.out.println("Enter OTP");
		otp=sc.nextInt();
		
		if(otp == otpGenerated) {
			System.out.println("OTP verification successful");
			System.out.println("Enter amount to be transferred");
			amount=sc.nextFloat();
			System.out.println("Enter Account Number of beneficiary");
			accNo=sc.nextLong();
			
			if(balance - amount >= 0) {
				balance -= amount;
				System.out.println("Rs. " + amount + " transferred successfully to Account Number " + accNo);
				System.out.println("Available balance: " + getBalance());
			}
			else {
				System.out.println("Insufficient funds");
			}
		}
		else {
			System.out.println("Invalid OTP");
		}
	}
	
	public float getBalance() {
		return balance;
	}

}
