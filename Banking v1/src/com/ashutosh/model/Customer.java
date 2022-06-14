package com.ashutosh.model;

public class Customer {
	
	//encapsulation
	private long bankAccountNo;
	private String password;
	
	//create constructor using IDE feature
	public Customer(long bankAccountNo, String password) {
		this.bankAccountNo = bankAccountNo;
		this.password = password;
	}
	
	//getter and setter methods using IDE features
	public long getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(long bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
