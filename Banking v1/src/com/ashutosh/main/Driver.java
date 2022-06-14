package com.ashutosh.main;

import java.util.Scanner;

import com.ashutosh.model.Customer;
import com.ashutosh.service.Banking;

public class Driver {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer(123456L, "password");
		Banking banking = new Banking();
		
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
			System.out.println("\nWelcome to the Banking Page\n");
			
			do {
				System.out.println("-----------------------------------------");
				System.out.println("Please choose option");
				System.out.println("1-> Deposit");
				System.out.println("2-> Withdrawal");
				System.out.println("3-> Transfer");
				System.out.println("0-> Logout");
				System.out.println("-----------------------------------------");
				
				choice=sc.nextInt();
				
				switch(choice) {
				case 0:
					break;
				
				case 1:
					//deposit
					banking.deposit();
					break;
					
				case 2:
					//withdrawal
					banking.withdrawal();
					break;
					
				case 3:
					//transfer
					banking.transfer();
					break;
					
				default:
					System.out.println("Please enter valid option number");
				}
				
			}while(choice != 0);
			
			System.out.println("Application exited successfully");
		}
		else {
			System.out.println("Please provide valid credentials");
		}

	}

}
