package com.revature.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class EncapsulationDriver {
	
	//Encapsulation 
	/*
	 * 	Encapsulation is about protecting data from dangerous operations. 
	 * 
	 * 	Is when we're building complex infrastucture/code for other developers to use, they won't know which 
	 * 	data should be manipulated and which data should be left alone. 
	 * 
	 * 	Encapsulation allows the creator of the code/library/infrasturcture to restrict "direct" access to 
	 * 	data fields so that there isn't any accidental/dangerous operations on it. Instead we provide indirect 
	 * 	access, so there is no danger. 
	 * 
	 * 	In Java we use access modifier to achieve encapsulation (private, package (default) , protected, public). 
	 * 	Restrict access to all of our data fields with the private keyword and provide public methods to access 
	 * 	those data fields. 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arrayList = new ArrayList<>();
		
//		arrayList.array // we restrict access to a state/data field. 

	}

}
