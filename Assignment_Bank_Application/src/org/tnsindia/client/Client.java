package org.tnsindia.client;

import org.tnsindia.application.MMBankFactory;
import org.tnsindia.application.MMCurrentAcc;
import org.tnsindia.application.MMSavingAcc1;
import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAcc1;
import org.tnsindia.framework.SavingAcc;


public class Client {


	public static void main(String[] args) {
		
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc1(63581,"Nutan Babar", 40000, true);
		CurrentAcc1 c=new MMCurrentAcc(859682, "Shiwani Mam", 60000, 2000);
		System.out.println();
		System.out.println("Saving Account is : "); 
		s.withdraw(s.getAccBal());
		System.out.println();
		System.out.println("Current Account is : "); 
		c.withdraw(c.getAccBal());
		System.out.println();
		System.out.println(s); 
		System.out.println(c); 
	}

}
