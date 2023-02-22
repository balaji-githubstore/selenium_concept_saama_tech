package com.ae.basics;

public class Demo4Array {

	public static void main(String[] args) {

		int[] numbers1 = { 10, 20, 50 };

		System.out.println(numbers1[2]);
		
		int[] numbers2=new int[3];
		numbers2[0]=10;
		numbers2[1]=20;
		numbers2[2]=50;
		
		System.out.println(numbers2[2]);
		
		
		int[][]  arr1= { {1,5}, {11,15}, {21,25} };
		
		System.out.println(arr1[2][0]);
		System.out.println(arr1[2][1]);
		
		
		int[][] arr2=new int[3][2];
		
		arr2[0][0]=1;
		arr2[0][1]=5;
		
		arr2[1][0]=11;
		arr2[1][1]=15;
		
		arr2[2][0]=21;
		arr2[2][1]=25;
		
		Object[][] arr3=new Object[3][2];
		
		arr3[0][0]=1.2;
		arr3[0][1]=5;
		
		arr3[1][0]="hello";
		arr3[1][1]=15;
		
		arr3[2][0]=21;
		arr3[2][1]=25;
		
	}

}
