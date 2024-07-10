package com.tnsif.finallyblock;

public class Test3 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			
		}
	catch(NullPointerException e) {
		System.out.println("welcome");
		
	}
	
    finally {
	System.out.println("welcome.java");
   
    }
  }
}
