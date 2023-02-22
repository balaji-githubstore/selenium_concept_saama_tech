package com.ae.loops;

public class Demo2ForAdvance {

	public static void main(String[] args) {
		
		int[] numbers = { 10, 89, 45, 25, 75, 4, 62, 90,55,54 };
			
		for(int num : numbers)
		{
			if(num==45)
			{
				System.out.println(num);
				break;
			}
		}

		String[] colors= {"red","blue","pink","green"};
		
		//write advance for loop to print each value from colors
		for(String color : colors)
		{
			System.out.println(color);
		}
	}

}
