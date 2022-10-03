package com.tns.operator;

import java.util.Scanner;

public class RealationalOpeartor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a=s.nextInt();
		System.out.println("Enter the value of b ");
		int b=s.nextInt();
	    boolean result=a>b;
		System.out.println("ans is "+result);
        s.close();
	}

}
