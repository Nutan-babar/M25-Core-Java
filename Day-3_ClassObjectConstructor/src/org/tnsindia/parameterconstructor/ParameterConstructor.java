package org.tnsindia.parameterconstructor;


class Car
{
	//variable
	public int speed;
	//method
	void display()
	{
		System.out.println("The speed is: "+speed+"km/hr");
	}
	//default constructor
	//Constructor is used to initialize the value of the variables
	Car(int a)
	{
      speed=a;
	}
}

public class ParameterConstructor {

	public static void main(String[] args) {
		
		//object creation
		Car obj=new Car(100);
		//obj.speed=50;
		//calling the method of car class
		obj.display();


	}

}
