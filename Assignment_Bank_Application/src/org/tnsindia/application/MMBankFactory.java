package org.tnsindia.application;

import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAcc1;
import org.tnsindia.framework.SavingAcc;

public class MMBankFactory<MMSavingAcc> extends BankFactory
{

	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc1 s=new MMSavingAcc1(accNo , accNm , accBal , isSalaried);
		return s;
	}

	public CurrentAcc1 getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc c=new MMCurrentAcc(accNo , accNm , creditLimit , creditLimit);
		return c; 
	}
	

}
