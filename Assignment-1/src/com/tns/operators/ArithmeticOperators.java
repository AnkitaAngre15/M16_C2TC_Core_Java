package com.tns.operators;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		sc.close();

	}

}
