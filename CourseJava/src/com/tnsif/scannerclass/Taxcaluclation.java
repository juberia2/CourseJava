package com.tnsif.scannerclass;

public class Taxcaluclation {
	public void calucatetax(Person p) {
		if(p.getIncome()<=1600) {
			p.setTax(0);
		}
		else if(p.getIncome()>1600 && p.getIncome()<30000) {
			p.setTax(5);
		}
		else {
			p.setTax(10);
		}
	}
}
