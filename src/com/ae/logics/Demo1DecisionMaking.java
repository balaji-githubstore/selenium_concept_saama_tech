package com.ae.logics;

public class Demo1DecisionMaking {

	
	public static void main(String[] args) {
		
		int num=-10;
		
		if(num<0)
		{
			//System.out.println(num);
			System.out.println(num+" is negative");
		}
		else if(num==0)
		{
			System.out.println("It's zero");
		}
		else
		{
			System.out.println(num+" is positive");
		}
		
		int pageNumber=250;
		
		//to check pagenumber falls b/w 100 and 200
		
		if(pageNumber>=100)
		{
			if(pageNumber<=200)
			{
				System.out.println("yes! falls b/w 100 and 200");
			}
		}
		
		
		if(pageNumber>=100 && pageNumber<=200)
		{
			System.out.println("yes! falls b/w 100 and 200");
		}
		
		
		
	}
}
