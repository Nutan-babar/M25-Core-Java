package org.tnsindia.framework;

public abstract class CurrentAcc1 extends BankAcc 
{
	
	private final float creditLimit;
	public CurrentAcc1(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}
	public void CurrentAcc(int accNo, String accNm, float accBal, float creditLimit2) {
		// TODO Auto-generated constructor stub
	}
	public void withdraw (float accBal) 
	{
		System.out.println("Account No is:"+this.getAccNo()+"\nAccount Name is:"+this.getAccNm()+
				"\nAccount Balance is:"+(accBal + creditLimit));
	}
	@Override
	public String toString() {
		return String.format("CurrentAccount [creditLimit=%s]", creditLimit);
	}

}