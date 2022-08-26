package com.revature.polymorphsim;

public class Kangaroo extends Animal {
	
	@Override // this is just a way of checking the method is overriding
	public void jump(String s) { //this is not overloading! because the method signature different.
		super.jump(s);
		System.out.println("Jumping like a kangaro");
	}
	
	
	public double greetings(String s) { //here, I've changed the access modifier! But I'm still overriding. 
		// when we override, we can make a method more public but we can't make it more private. 
		
		return 1;
	}

}
