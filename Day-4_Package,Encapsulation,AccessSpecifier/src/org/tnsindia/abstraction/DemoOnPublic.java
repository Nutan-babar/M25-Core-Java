package org.tnsindia.abstraction;

class B
{
	//if any data members is public the visibility is 
	public String dob="10-11-1999";
	public void display()
	{
		System.out.println("The DOB is: "+dob);
	}
}

public class DemoOnPublic {

	public static void main(String[] args) {
		B b=new B();
		b.display();
	
	}

}
