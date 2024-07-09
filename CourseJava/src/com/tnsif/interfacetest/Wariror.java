package com.tnsif.interfacetest;

public class Wariror implements Character,Weapon {

	@Override
	public void use() {
 System.out.println("Warrior");		
	}

	@Override
	public void attack() {
System.out.println("attack");

	}
	
 public static void main(String[] args) {
	 Wariror w=new Wariror() ;
	 w.attack();
	 w.use();
		 
	 }
  }

