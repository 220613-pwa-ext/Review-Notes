package com.revature;

public class MainDriver {
	
	// What is Java?
	//  High Level, compiled programming language. 
	//  High level: relatively easy for people, we don't need to work with low level concepts like memory management.
	// 		(Garbage Collection)
	// 	Compiled: Java is written in a C based readable code, then compiled into bytecode. Bytecode is interpreted by 
	//		the JVM into machine readable code. 
	//	OOP: 
	//  Strongly typed language 
	
	public static void main(String[] args) {
		
		//Declare a variable in java, we need to provide a data type and a name of the variable. 
		//Once a variable has been declared, we cannot change its type. 
		
		int i;
		i = 1;
		
		//Assignemnet, setting a variable to equal a value 
		i = -27; 
//		i = "String";
//		i = 'a';
		
		
		Object o; 
		
		//intialization 
		new Object();
		
		//Declaration, assignemnt and intialization. 
		Object o2 = new Object();
		
		//Primitive datatypes vs Object datatype. 
		// Object 
		//  	 If classes are blueprints, objects are the actual code we use to define the inside of it. 
		//		 Objects are an instance of a class, Objects are created in the "heap" and variables hold a reference 
		//		 to the object in the heap. 
		//		 Objects are made up of structrual and behavioral components. Objects can store data fields and have 
		//			methods. 
		
		
		// Primitive is a very simple datatype, only stores a single value.
		// In fact they can be defined by how much bytes they take up. 
		
		int i2 = 1;
		
//		i2. // nothing appears because the variable has no methods or any other values. 
		
		//Integer is a wrapper class, that "wraps" around primitives. 
		Integer i3 = 1;
		
		Long longValue = 0l;
		Float f = 1f;
		Double d = 1.0;
		
		System.out.println(f.MAX_VALUE);
		System.out.println(d.MAX_VALUE);
		
		System.out.println(longValue.MAX_VALUE);
		
//		i3.byteValue();
//		i3.MIN_VALUE;
		
		
		//Java has 8 primitives 
		//      character
		//		int 	- 32 bits/ 4 byte
		//		bool    - 8 bits/ byte 
		// 		long	- 64 bits/ 8 bytes 
		//  	float   - 32 bits/ 4 bytes
		// 		double  - 64 bits/ 8 bytes 
		//      short   - 16 bits/ 2 bytes
		// 		byte 	- 8 bits/1 byte 
		
		
		// Control Flo w
		/*
		 * (traditional) For loop 
		 * 
		 * For each loop 
		 * 
		 * While loop 
		 * 
		 * Do While loop 
		 * 
		 * if, else if, and else 
		 * 
		 * switch case default 
		 * 
		 * 
		 */
		
		
	}

}
