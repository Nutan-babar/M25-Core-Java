package org.tnsindia.abstraction;
//Demo on private access specifier

class A
{
	//pirvate variable
	private float salary;
	
//setters and getters method to access private dta members
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}

public class DemoOnPrivate {

	public static void main(String[] args) {
		A a=new A();
		a.setSalary(30000);
		System.out.println("The salary is: "+a.getSalary());

	}

}
