package com.tns.operator;

import java.util.Scanner;

public class AssignmentOpearator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a=s.nextInt();
		System.out.println("Enter the value of b ");
		int b=s.nextInt();
	    a*=b; //a=a*b
		System.out.println(a);
        s.close();

	}

}
