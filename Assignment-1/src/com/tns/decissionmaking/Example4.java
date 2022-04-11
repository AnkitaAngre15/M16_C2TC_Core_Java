package com.tns.decissionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	switch(a)
	{
	
	case 1:
		System.out.println("Shrivalli");
		break;
		
	case 2:
		System.out.println("Hello");
		break;
		
	case 3:
		System.out.println("Ankita");
		break;
		
		default:
			System.out.println("Invalid Input");
			
			sc.close();
	}

	}

}
