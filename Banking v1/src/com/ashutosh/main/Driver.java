package com.ashutosh.main;

import java.util.Scanner;

import com.ashutosh.model.Customer;

public class Driver {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer(123456L, "password");
		
		Scanner sc = new Scanner(System.in);
		
		long accNo;
		String pwd;
		

		System.out.println("Welcome to log-in page\n");
		System.out.println("Enter Account Number");
		accNo = sc.nextLong();
		System.out.println("Enter your Password");
		pwd=sc.next();
		
		if(cust1.getBankAccountNo() == accNo && cust1.getPassword().equals(pwd)) {
			System.out.println("Welcome to the Banking Page");
		}

	}

}
