package com.tnsif.finallyblock;

public class Testone {
public static void main(String[] args) {
	try {
		System.out.println(100/0);
		
	}
catch(Exception e) {
	System.out.println("exception caught"+e.getMessage());
	
	
}
	finally {
		System.out.println("end");
	}
	}
}
