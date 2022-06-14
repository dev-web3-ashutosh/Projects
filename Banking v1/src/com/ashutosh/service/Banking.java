package com.ashutosh.service;

import java.util.Scanner;

public class Banking {
	
	float balance=0;
	int amount;
	Scanner sc = new Scanner(System.in);
	
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
		
	}
	
	public float getBalance() {
		return balance;
	}

}
