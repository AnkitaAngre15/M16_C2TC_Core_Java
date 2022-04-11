package com.tns.operators;

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

		boolean rel=(a==b);
		System.out.println(rel);
		sc.close();

	}

}
