package in.cg.intro;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		float a=4.5f;
		System.out.println(a);//Compile Output
		
		Scanner sc=new Scanner(System.in);
		float b=sc.nextFloat();
		System.out.println(b);//Runtime Output
		sc.close();
		

	}

}
