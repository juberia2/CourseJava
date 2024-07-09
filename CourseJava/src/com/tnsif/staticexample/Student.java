package com.tnsif.staticexample;

public class Student {
int rollnum;
String name;
static String college="SRI INDU";
static void change() {
	college=" SRI INDI";
	
}
Student(int r,String n){
rollnum=r;
name=n;
}
void display() {
	System.out.println(rollnum+""+name+""+college);
}
}
