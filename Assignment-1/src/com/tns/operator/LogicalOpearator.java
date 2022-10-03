package com.tns.operator;

public class LogicalOpearator {

	public static void main(String[] args) {
		int a=3,b=4;
	boolean result=(a<b && b<8);
	boolean result1=(a>b || b>8);
	boolean result2= !(a<b);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}

}
