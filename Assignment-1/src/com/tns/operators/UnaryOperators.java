package com.tns.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		
		int a=5,b=3;
		int x=a++;//5
		int y=++b;//4
		int z=a+x;//6+5
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		

		int a1=5,b1=3;
		int x1=a1--;//5
		int y1=--b1;//2
		int z1=a1-x1;//4-5
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(z1);

	}

}
