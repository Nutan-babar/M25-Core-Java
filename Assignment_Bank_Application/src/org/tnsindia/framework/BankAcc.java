package org.tnsindia.framework;

public abstract class BankAcc 
{
	private int accNo;
	private String accNm;
	private float accBal;
	

	public BankAcc(int accNo,String accNm,float accBal) 
	{
		super();
		this.accNo= accNo;
		this.accNm= accNm;
		this.accBal=accBal;
		
	}
	public void BankAcc(int accNo2, String accNm2, float accBal2) {
		// TODO Auto-generated constructor stub
	}
	abstract public void withdraw(float accBal);
	public void deposite (float accBal)
	{
		System.out.println(accBal);
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	@Override
	public String toString() {
		return String.format("BankAccount [accNo= %s , accNm= %s , accBal= %s]", accNo , accNm , accBal);
	}
	

}
