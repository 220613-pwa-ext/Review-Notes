package com.revature.inheritance;

public class Animal {
	
	//no -args
	public Animal() {
		
	}

	public String name;
	private String secretName; 
	
	public void jump() {
		System.out.println("I can jump");
	}
	
	private void secretMove() {
		System.out.println("this is secret!d");
	}
}
