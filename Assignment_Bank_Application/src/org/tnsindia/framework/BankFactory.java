package org.tnsindia.framework;

public abstract class BankFactory 
{
	abstract public SavingAcc getNewSavingAccount(int accNo , String accNm , float accBal , boolean isSalaried);
	abstract public CurrentAcc1 getNewCurrentAccount(int accNo , String accNm , float accBal , float creditLimit);

}
