package com.tnsif.overriding;

public class Father {
  void drinking() {
	  System.out.println("boost");
	  
  }
  public static void main(String[] args) {
	  Child c=new Child();
		c.drinking();
}
}
