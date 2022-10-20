package org.tnsindia.strings;

import java.util.Scanner;

public class StringDemoUsingNewKeyword {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Entre an input String:");
		String str=new String(s.nextLine());
		System.out.println(str);
		s.close();

	}

}
