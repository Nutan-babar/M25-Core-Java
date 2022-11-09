package org.tnsindia.framework;

import org.tnsindia.framework.CurrentAcc;
import org.tnsindia.framework.SavingAcc;

public abstract class BankFactory 
{
	abstract public SavingAcc getNewSavingAccount(int accNo , String accNm , float accBal , boolean isSalaried);
	abstract public CurrentAcc getNewCurrentAccount(int accNo , String accNm , float accBal , float creditLimit);

}
