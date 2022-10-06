package org.tnsindia.Inheritance;

import java.util.Scanner;

//Demo on Single-Inheritance 

//parent class
class Animal
{
	protected String name;
	public void display()
	{
		System.out.println("The Dog Name is: "+name);
	}
}

// Child class
class Dog extends Animal
{
	public String Breed;
	public void print()
	{
		System.out.println("The Animal is : "+Breed);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		//object create for child class
		Scanner s=new Scanner(System.in);
		String name1=s.nextLine();
		String Breed1=s.nextLine();
		Dog d=new Dog();
		d.Breed=Breed1;
		d.name=name1;
		d.display();
		d.print();
		

	}

}
