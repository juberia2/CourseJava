package com.tnsif.abstraction;
//class for abstract

public abstract class Shape {
	
	protected float area;
	
 //abstract method
	
	abstract void calarea();
void show() {
System.out.println("area of shape is:"+area);	
}
}
