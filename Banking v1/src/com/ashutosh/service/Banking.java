package com.ashutosh.service;

import java.util.Scanner;

public class Banking {
	
	float balance, amount = 0;
	Scanner sc = new Scanner(System.in);
	
	public void deposit() {
		System.out.println("Enter the amount to deposit");
		amount=sc.nextFloat();
		
		if(amount>0) {
			balance += amount;
			System.out.println("Rs. " + amount + " deposited successfully");
			System.out.println("Available balance: " + getBalance());
		}
		else {
			System.out.println("Please enter valid amount");
		}
	}
	
	public void withdrawal() {
		
	}
	
	public void transfer() {
		
	}
	
	float getBalance() {
		return balance;
	}

}
