package com.tns.decisionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// Switch case
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
	    switch(a)
	    {
	    case 1:
	    	System.out.println("Nutan");
	    	//break;
	    case 2:
	    	System.out.println("Shivani");
	    	break;
	    case 3:
	    	System.out.println("Priti");
	    	break;
	    	default:
	    		System.out.println("Invalid Input");

	    }
	}

}
