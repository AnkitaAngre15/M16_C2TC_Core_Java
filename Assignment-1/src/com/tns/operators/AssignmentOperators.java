package com.tns.operators;

import java.util.Scanner;

public class AssignmentOperators {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

	    a*=b;//a=a*b
		System.out.println(a);
		sc.close();


	}

}
