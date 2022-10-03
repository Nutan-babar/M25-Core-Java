package com.tns.looping;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;i<=a; i++)
		{
			System.out.print(i+ "");
			s.close();
		}

	}

}
