package org.tnsindia.abstractkeyword;

abstract class Demo
{
	void print()
	{
		System.out.println("Non-abstract Method");
	}
}
class Demo1 extends Demo
{
	
}

public class DemoOnAbstractClasss {

	public static void main(String[] args) {
		Demo c=new Demo1();
		c.print();

	}

}
