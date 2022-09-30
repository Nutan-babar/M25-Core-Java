package org.tnsindia.packagedemo;

public class PackageDemo {

	public String str;
	/* if any method pf variable is declared is default then that method or variable 
	 * you can not access into another package
	 *   
	 *   
	 *   default method
	 * public void display()
	
	{
		System.out.println("The name of string is: "+str);
	}
	 */
	  // public method
	public void display()
	
	{
		System.out.println("The name of string is: "+str);
	}
}
