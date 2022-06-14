package com.ashutosh.model;

public class Customer {
	
	//encapsulation
	private long bankAccountNo;
	private String password;
	
	//setter method
	public void setCredential(long bankAccountNo, String password) {
		this.bankAccountNo=bankAccountNo;
		this.password=password;
	}
	
	//getter method
	public void getCredential() {
		System.out.println("Account Number: " + bankAccountNo);
		System.out.println("Password: " + password);
	}

}
