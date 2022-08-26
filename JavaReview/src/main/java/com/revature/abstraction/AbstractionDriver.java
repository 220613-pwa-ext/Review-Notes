package com.revature.abstraction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AbstractionDriver {
	
	/*
	 * Abstraction: 
	 * 		The concept of hiding implementation to show functionality. 
	 * 		We want to create an interface, a easy to use tool to get access to all the complex underlying functaionality. 
	 * 
	 * 		In Java we use other developers libraries and tools, by simply accessing there methods. 
	 * 
	 * 		In Java, as a developer we want to create tools and libraries that other developers can use. We could provide 
	 * 		a class, but then they may have to understand how the class words! Instead we use interaces, specifically 
	 * 		the abstract methods inside. 
	 * 
	 * 		In Java we achieve abstraction with interfaces and abstract classes. 
	 * 
	 * 		Interface must have all abstract methods, methods must be public. Methods can be default to provide implementation, 
	 * 		this is a feature of Java 8 (diamond problem) 
	 * 
	 * 		Abstract classes are partial abstraction, a class can be abstract by providing the keyword in the class. 
	 * 		Abstract classes may have abstract methods and cannot be instantiated directly -> must be extended by a concrete class. 
	 * 
	 * 		(Homeogenous inheritance)
	 * 		I -> I (extends)
	 * 		C -> C (extends)
	 * 		C -> AC or AC -> C (extends) 
	 * 
	 * 		(Hetrogenous inheritance)
	 * 		I -> C (implements)
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Ferrari(); //Ferrari is abstract, cannot be directly instantiated. 
		Car c2 = new Ford(); 
		
		Truck t = new Ford();
		
		c2.drive();
		c2.accelerate();
		
		t.drive();
//		t.accelerate();
		
		
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		
		
		
		

	}

}
