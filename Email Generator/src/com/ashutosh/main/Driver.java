package com.ashutosh.main;

import java.util.Scanner;

import com.ashutosh.model.Employee;
import com.ashutosh.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Ashutosh", "Tripathi");
		CredentialService cs = new CredentialService();
		Scanner sc = new Scanner(System.in);
		
		String genEmail;
		char[] genPassword;
		int choice;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			genEmail = cs.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "tech");
			genPassword = cs.generatePassword();
			cs.showCredentials(emp, genEmail, genPassword);
			break;
		
		case 2:
			genEmail = cs.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "admin");
			genPassword = cs.generatePassword();
			cs.showCredentials(emp, genEmail, genPassword);
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			break;
			
		default:
			System.out.println("Invalid Input");
		}
		
		sc.close();
	}

}
