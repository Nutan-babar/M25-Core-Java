package org.tnsindia.staticoperator;

public class DemoOnStaticBlock {
	
	static int x=20;
	//int y=24;
	static int y;
	//static block-used to initialize static data members
	static
	{
		//we can't use non-static variable inside the static block
		y=x+50;
	}

	public static void main(String[] args) {
		System.out.println("value of a:" +x);
		System.out.println("value of b:" +y);

	}

}
