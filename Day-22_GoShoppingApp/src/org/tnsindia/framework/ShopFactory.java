package org.tnsindia.framework;

import org.tnsindia.application.GSPrimeAcc;

//abstract class
public abstract class ShopFactory {
	public abstract GSPrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime);
	public abstract NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges);


}