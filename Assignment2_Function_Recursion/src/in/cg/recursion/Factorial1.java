package in.cg.recursion;

import java.util.Scanner;

		public class Factorial1 {
			
			//Function Definition
			static int factorial(int n) {
				
		if(n==1) 
			return 1;
					
			else
						
					
			return n*factorial(n-1);
				}
		
			
 public static void main(String[] args) {
			
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(factorial(n));//Function Call
	sc.close();
			}


	}


