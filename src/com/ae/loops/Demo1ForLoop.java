package com.ae.loops;

public class Demo1ForLoop {

	public static void main(String[] args) {

		int[] numbers = { 10, 89, 45, 25, 75, 4, 62, 90,55,54 };

		// print all the values less than or equal to 50
		
		for (int i = 0; i < numbers.length; i++) 
		{
			
			if(numbers[i]==89)
			{
				System.out.println(numbers[i]+" is present");
				break;
			}
		}
		
//		for (int i = 0; i < numbers.length; i++) 
//		{
//			
//			if(numbers[i]==89)
//			{
//				continue;
//			}
//			
//			System.out.println(numbers[i]);
//		}

	}
}
