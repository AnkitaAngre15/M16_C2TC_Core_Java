package in.cg.scanner;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		double b=sc.nextDouble();
		String str=sc.nextLine();
		System.out.println(a);
		System.out.println(b);
		System.out.println(str);
		sc.close();
		
	}

}
