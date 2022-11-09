package org.tnsindia.application;

import org.tnsindia.framework.SavingAcc;

public class MMSavingAcc1 extends SavingAcc
{

	public MMSavingAcc1(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo , accNm , accBal , isSalaried);
		// TODO Auto-generated constructor stub
	}

	public void MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("MMSavingAccount [toString()=%s]", super.toString());
	}
	

}