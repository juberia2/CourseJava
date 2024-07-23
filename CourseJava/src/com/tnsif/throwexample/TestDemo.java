package com.tnsif.throwexample;

import java.util.Scanner;   

public class TestDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter reollnum");
	int rollnum=sc.nextInt();
	if(rollnum<0) {
		throw new ArithmeticException("roll num cannot be nrgative");
		
	}
	else {
		System.out.println("valid roll num");
	}
	
	
}
}
