package com.tns.operator;

public class UnaryOperator {

	public static void main(String[] args) {
		int a=5,b=3;
        int m=a++;
        int n=++b;
        int o=a+m;
        System.out.println("Increment Operator is:");
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        
        int a1=5,b1=3;
        int m1=a--;
        int n1=--b;
        int o1=a-m1;
        System.out.println("Decrement Operator is:");
        System.out.println(m1);
        System.out.println(n1);
        System.out.println(o1);

	}

}
