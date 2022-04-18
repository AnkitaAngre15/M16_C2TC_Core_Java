package in.cg.recursion;

import java.util.Scanner;

public class Sum_Of_Digits {

	          int sum(int num) {
	        	  if(num==0)
	        		  return 0;
	        	  else
	        		  return( (num%10)+sum(num/10));
	          }
	public static void main(String[] args) {
		
		Sum_Of_Digits obj=new Sum_Of_Digits();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
	    int x=sc.nextInt();
	    int result=obj.sum(x);
	    System.out.println("Ouput is:" + result);
	    sc.close();


	}

}
