package com.ashutosh.service;

import java.util.Random;

public class CredentialService {
	
	public char[] generatePassword( ) {
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = capitalLetters.toLowerCase();
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*()_=+-/?<>";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		char[] pwd = new char[8];
		
		Random rand = new Random();
		
		for(int i=0; i<8; i++) {
			pwd[i] = values.charAt(rand.nextInt(values.length()));
		}
		
		return pwd;
	}
	
	

}
