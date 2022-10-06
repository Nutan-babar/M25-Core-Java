package org.tnsindia.finalkeyword;

class A1
{
	final void display()
	{
		System.out.println("Final method is inherited but not the override");
	}
}
class B1 extends A1
{
	void print()
	{
		System.out.println("Child class");
	}
}

public class DemoOnFinalMethodInherited {

	public static void main(String[] args) {
		B1 b=new B1();
		b.display();
		b.print();

	}

}
