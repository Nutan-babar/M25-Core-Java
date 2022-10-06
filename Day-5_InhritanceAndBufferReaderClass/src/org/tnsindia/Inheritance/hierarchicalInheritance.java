package org.tnsindia.Inheritance;

//Parent class
class AndroidVersion
{
	protected String name="Android Latest Version";
	public void display1()
	{
		System.out.println(name);
	}
}

//Child class
class Tiramisu extends AndroidVersion
{
	//method overriding
	public String v13="Tiramisu";
	public  void display()
	{
		System.out.println(v13);
	}
}

// Child class 2
class SnowCone extends AndroidVersion
{
	public String v12="Snow Cone";
	public void display()
	{
		System.out.println(v12);
	}
}

public class hierarchicalInheritance {

	public static void main(String[] args) {
		Tiramisu t=new Tiramisu();
		t.display();
		SnowCone s=new SnowCone();
		s.display();
		t.display1();

	}

}
