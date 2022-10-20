package org.tnsindia.strings;

import java.util.Scanner;
public class StringDemo {

	public static void main(String[] args) {
		String str="Sandip Jadhav";
		System.out.println(str);
		Scanner s=new Scanner(System.in);
		System.out.println("Please entre an input String:");
		String str1=s.nextLine();
		System.out.println("You Entered String:"+str1);
		s.close();
		

	}

}
