package com.tns.decissionmaking;

public class Example3 {

	public static void main(String[] args) {
		
		int age=10,weight=130;
		if(age>=12)
		{
	
			if(weight>=40)
			{
				if(weight<=110) 
				{
					System.out.println("Eligible For Bunjee Jumping");
				}
				else
				{
					System.out.println("Extra Ropes Will Be Added");
				}
			}
		}
		else 
		{
			System.out.println("Not Eligible For Bunjee Jumping");
		}
		
		}


}



