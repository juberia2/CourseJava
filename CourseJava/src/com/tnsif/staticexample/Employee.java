package com.tnsif.staticexample;

public class Employee {
 int Eid;
 String name;
 static String company="TNS";
 
 Employee(int r,String n){
	 Eid=r;
	 name=n;
	 
 
 }
void display() {
	System.out.println(Eid+" "+name+" "+company);
	
}
}
