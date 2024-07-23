package com.tnsif.comparableinterface;

public class Student implements Comparable<Student>{
	
	int rollno;
	String name;
	String branch;
	
	public Student(int rollno, String name, String branch) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", branch=" + branch + "]";
	}

	@Override
	public int compareTo(Student s) {
		
		//return this.name.compareTo(s.name);
		
		return this.rollno-s.rollno;
	}
	
	

}
