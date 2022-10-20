package org.tnsindia.interfaceexamples;

import java.util.Scanner;

//child class to implement the methods of interface
public class ShapeArea{

	public void circle() {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double r=s.nextDouble();
		System.out.println("The area of Circle is: "+3.142*r*r);
		
	}

	public void square() {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the side of the square");
		double side=s.nextDouble();
		System.out.println("The area of Square is: "+side*side);
		
	}

	
		
	}

