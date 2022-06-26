package com.ashutosh.service;

import java.util.Random;

public class RollingDice {
	
	Random rand = new Random();
	
	public int rollDice() {
		return rand.nextInt(6)+1;
	}

}
