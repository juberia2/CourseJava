package com.tnsif.scannerclass;

import java.util.Scanner;

public class Scannerexample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter you are name");
		String name=sc.nextLine();
		
		System.out.println("enter the rollnumber");
		int roll=sc.nextInt();
		sc.close();
	}
	}


