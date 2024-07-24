package com.tnsif.Applications;

import com.tnsif.Frameworl.NormalAcc;
import com.tnsif.Frameworl.PrimeAcc;
import com.tnsif.Frameworl.ShopFactory;

public class GSShopFActory implements ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		PrimeAcc primeacc=new GSPrime(accNo,accNm,charges,isPrime);
		return primeacc;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliverycharges) {
		NormalAcc normalacc=new GSNormal(accNo,accNm,charges,deliverycharges);
		return normalacc;
	}


}
