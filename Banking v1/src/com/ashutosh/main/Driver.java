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
			int choice;
			System.out.println("-----------------------------------------");
			System.out.println("Welcome to the Banking Page\n");
			System.out.println("Please choose option");
			System.out.println("1-> Deposit");
			System.out.println("2-> Withdrawal");
			System.out.println("3-> Transfer");
			System.out.println("4-> Logout");
			System.out.println("-----------------------------------------");
			
			choice=sc.nextInt();
			
		}
		else {
			System.out.println("Please provide valid credentials");
		}

	}

}
