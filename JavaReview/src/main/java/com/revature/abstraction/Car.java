package com.revature.abstraction;

public interface Car {
	
	//An interface is 100% abstraction, all the methods are abstract by default. 
	// An abstract method does not have any implementaiton. 
	
	void drive(); //by deafult all methods in interace are public and abstract. 
	public abstract void drive2();
	
	void brake();
	
	public boolean steer();
	
	public void accelerate();

}
