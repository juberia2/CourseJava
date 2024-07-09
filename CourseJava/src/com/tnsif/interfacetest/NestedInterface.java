package com.tnsif.interfacetest;

public class NestedInterface implements MyInterface.MyinnerInterface {
	 
		
	
	public static void main(String[] args) {
		
	 NestedInterface n=new   NestedInterface();
	 n.print();
	 System.out.println("NestedInterface.id");
	}
	@Override
	public void print() {
		 System.out.println("inner interface");
	}

}
