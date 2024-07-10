package com.tnsif.exception;

public class NestedTrycatch {
public static void check() {
	String str="TNS";
	
	int slength=str.length();
	
	System.out.println("String length"+slength);
	String anotherstring="jubbu";
	int y=6;
	try {
		try {
			System.out.println (str.charAt(y));
			
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Indexout of bound exception"+e.getMessage());
		}
	System.out.println("String length"+anotherstring.length());
	}
	catch(NullPointerException e) {
		System.out.println("Exception is throw"+e.getMessage());

	
	}
}
}
