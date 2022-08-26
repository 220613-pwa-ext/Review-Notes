package com.revature.encapsulation;

import java.io.Serializable;
import java.util.Objects;

public class JavaBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8823599713315071436L;
	
	
	
	
	public JavaBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public JavaBean(String name, double number) {
		super();
		this.name = name;
		this.number = number;
	}
	private String name;
	private double number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "JavaBean [name=" + name + ", number=" + number + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JavaBean other = (JavaBean) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(number) == Double.doubleToLongBits(other.number);
	}
	
	
	
}
