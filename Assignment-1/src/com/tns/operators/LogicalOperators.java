package com.tns.operators;



public class LogicalOperators {

	public static void main(String[] args) {

		int a=22,b=45;

		boolean log=(a>b && b<a);
		boolean log2=(a>b || b>a);
		boolean log3= !(a<b);
		System.out.println(log);
		System.out.println(log2);
		System.out.println(log3);
	}

}
