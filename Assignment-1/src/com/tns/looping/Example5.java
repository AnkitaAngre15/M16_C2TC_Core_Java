package com.tns.looping;

public class Example5 {

	public static void main(String[] args) {
		
		//Right Angled Triangle......
		for(int i=1;i<=6;i++)//Rows
		{
			for(int j=1;j<=i;j++) //Columns
			{
				System.out.print("*");
			}
			System.out.println();//Next Row
		}

	}

}
