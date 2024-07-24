package com.tnsif.MainMethod;

import com.tnsif.Applications.GSNormal;
import com.tnsif.Applications.GSPrime;
import com.tnsif.Applications.GSShopFActory;

public class Client {
	public static void main(String[] args) {
		GSShopFActory obj=new GSShopFActory();
		
		// prime account creation
		
		GSPrime ga=(GSPrime)obj.getNewPrimeAccount(12, "java", 500.6f, true);
		ga.bookproduct(ga.getCharges());
		
		//normal account creation
		
		GSNormal ge=(GSNormal)obj.getNewNormalAccount(13, "spring", 500.6f, 65.4f);
		ge.bookproduct(ge.getCharges());
	}

}
