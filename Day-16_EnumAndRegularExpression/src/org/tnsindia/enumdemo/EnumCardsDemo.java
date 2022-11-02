package org.tnsindia.enumdemo;

//We can implement interface using enum
public enum EnumCardsDemo implements InterfaceCardsDemo{
	HEART,CLUB,DIAMOND,SPADES, DIAMOND1;

	@Override
	public void print() {
		System.out.println("Selected Shape in the Cards are: "+this);
		
	}

}
