package org.tnsindia.abstraction;

class C
{
	//default variable
	String VehicleType;
}

public class DemoOnDefault {

	public static void main(String[] args) {
		C c=new C();
		
		/* if any data members is default than it can access only inside the same package
		 * it can not be acess outside the another package
		 */
		c.VehicleType="Train";
		System.out.println("Vehicle Type is: "+c.VehicleType);

	}

}
