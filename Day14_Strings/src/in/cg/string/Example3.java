package in.cg.string;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		String str1=new String(sc.nextLine());
		//String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str1.length());
        System.out.println(str1 == str2);
        sc.close();
    }




	

}
