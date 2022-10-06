package org.tnsindia.Inheritance;

class Vehicle
{
	protected String name="car";
	public void display()
	{
		System.out.println(name);
	}
}

class BMW extends Vehicle
{
	//method overriding
	public String name1="BMW";
	public  void display1()
	{
		System.out.println(name1);
	}
}

// Child class 2
class Tyre extends BMW
{
	public String name2="BridgeStone";
	public void display2()
	{
		System.out.println(name2);
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		Tyre t=new Tyre();
		t.display();
		t.display1();
		t.display2();


	}

}
