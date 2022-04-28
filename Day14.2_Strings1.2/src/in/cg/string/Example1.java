package in.cg.string;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		StringBuffer sb=new StringBuffer(sc.nextLine());
		System.out.println(sb.capacity());//16
		sc.close();		
		

	}

}
