package org.tnsindia.application;

import org.tnsindia.framework.NormalAcc;
import org.tnsindia.framework.ShopFactory;

public class GSShopFactory extends ShopFactory{

	@Override
	public GSPrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc p=new GSPrimeAcc(accNo,accNm,charges,isPrime);
		return p;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc n=new GSNormalAcc(accNo,accNm,charges,deliveryCharges);
		return n;
	}

}
