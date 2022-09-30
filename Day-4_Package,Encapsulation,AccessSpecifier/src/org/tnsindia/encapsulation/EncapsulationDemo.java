package org.tnsindia.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// object creation
		HDFC h=new HDFC();
		//setting the values using setters mathod
		h.setPin_no(1000);
		//returning the output using getters method
		System.out.println("the pin of ATM is: "+h.getPin_no());

	}

}
