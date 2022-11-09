package org.tnsindia.application;

import org.tnsindia.framework.CurrentAcc1;

public class MMCurrentAcc extends CurrentAcc1
{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	public void MMCurrentAcc(int accNo, String accNm, float creditLimit, float creditLimit2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("MMCurrentAccount [toString()=%s]", super.toString());
	}
	

}
