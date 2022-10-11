package org.tnsindia.overriding;
 
class A
{
	int a=10;
	public void add()
	{
		System.out.println("from a");
	}
	public void add1()
	{
		System.out.println("from b");
	}
}

public class DemoOnMethodOverriding {

	public static void main(String[] args) {
	  A a1=new A();
	  a1.add();

	}

}
