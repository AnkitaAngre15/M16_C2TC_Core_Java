package in.cg.recursion;

import java.util.Scanner;

public class FibonacciSeries {
	
	int fib(int n)
	{
		if(n==0 || n==1)
			return n;
		else
			return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		
		FibonacciSeries obj=new FibonacciSeries();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int x=sc.nextInt();
		System.out.println(obj.fib(x));
		sc.close();

	}

}
