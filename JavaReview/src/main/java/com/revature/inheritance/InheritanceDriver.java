package com.revature.inheritance;

public class InheritanceDriver {
/*
 * Inheritance: 
 * 		An importnat pillar of OOP, it allows to resue code from a parent class in our child class. 
 * 		By code reuse, we have to write less code. 
 * 
 * 		In Java we achieve this using the "extends" keyword, the child class will inherit everything 
 * 		that it's allowed to inherit (private or package data fields and methods don't get inherited) 
 * 
 * 		In Java we can't have multiple parents, but we can have multilevel inheritance
 * 
 * 		A -> B -> C : C will inherit both B's and A's methods 
 * 
 * 		A -> 
 * 			 C : this is not allowed in Java
 * 		B -> 
 * 
 * 		When we inherit, we also are considered the same data type. 
 *		Dog can be considered, a Dog data type, a Animal data type and a Object data type. 
 *
 *		Object is the root class for all classes in Java, where we inherit some of the basic methods like 
 *		.equals, .toString, .hashcode, etc ... 
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Animal a = new Animal();
		a.name = "Bobby";
		
		System.out.println(a.name);
//		System.out.println(a.secretName);
		
		a.jump();
//		a.secretMove();  this method is not accessible, because it is private. 
		
		Dog d = new Dog(); //Even though we didn't write anything, we still get access to Animal methods. 
		d.name = "Bobby the dog";
		d.jump();
//		d.secretName();  
		
		Animal a2 = new Dog();
		Object o2 = new Dog();
		

	}

}
