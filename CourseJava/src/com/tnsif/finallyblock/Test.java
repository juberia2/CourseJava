package com.tnsif.finallyblock;

public class Test {

public static void main(String[] args) {
	try {
		System.out.println("welcome");
		
	}
catch(Exception e) {
	
	System.out.println("exception");
}
	finally{
		System.out.println("hello");
		
	}
}
}
