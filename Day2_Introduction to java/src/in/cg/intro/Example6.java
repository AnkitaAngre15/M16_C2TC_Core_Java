package in.cg.intro;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		String str="Introduction To JAVA";
		System.out.println(str);//Compile Output
		
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.nextLine();
		System.out.println(a);
		System.out.println(b);//Runtime Output
		sc.close();

		

	}

}
