package com.revature.polymorphsim;

public class PolyDriver {
	
	/*
	 * Polymorphism: 
	 * 		It means to be able to take many forms. To give us flexibility in how we inherit our code. 
	 * 		For example if a class has 90% of them methods we like, we can modify the remaining methods to fit our needs. 
	 * 
	 * 		In Java: 
	 * 			Overrding: 
	 * 				Only works with methods we inherit, where we can modify the implementaiton of the method. 
	 * 				Overriding, methods have to have the same signature and they have to be as public if not more public 
	 * 				that what they inherit. 
	 * 
	 * 				@Override annotation is not required, but optional if you want to ensure you're overriding. 
	 * 			Overloading:
	 * 				Works with methods in the same class, we distinguish seperate implementations via 
	 * 				method arguments. 
	 * 
	 * 				Overloaded methods can return something else, but you still need to make sure it's overloaded! 
	 * 
	 * 				Overloaded methods can also have their access modifier changed!
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		doSomething(1,1, "Hello");
		doSomething(true);
		doSomething("Hello again",1,1);

	}
	
	
	public static void doSomething(int x, int y, String z) {
		System.out.println("Doing something");
	}
	
	//we can change the data type of the arguments 
	public static void doSomething(boolean x, String y, String z) {
		System.out.println("Doing something else");
	}
	
	//we can change the number of arguments 
	public static void doSomething(boolean x) {
		System.out.println("Doing something else else");
	}
	
	//we can change the order of arguments
	static boolean doSomething(String z, int x, int y) {
		System.out.println("Doing something");
		return true;
	}
	
		
	

}
