package com.ae.basics;

public class Demo3Array {
	
	public static void main(String[] args) {
		
		//10,20,30,40,50 
		
		int[] numbers=new int[5]; //5*32 bits of memory
		
		//numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		
		double[] arr=new double[2]; //2*64 bits
		//arr[0]=10.2;
		arr[1]=25.2;
		
		System.out.println(arr[0]);
		
		//create an array to load red, green, yellow 
		String[] colors=new String[3];
//		colors[0]="red";
		colors[1]="green";
		colors[2]="yellow";
		
		System.out.println(colors[0]);
		
		System.out.println(numbers);
		System.out.println(arr);
		System.out.println(colors);
		
		boolean[] arr1=new boolean[2]; //2*1 bits
		arr1[0]=true;
		
		System.out.println(arr1[0]);
		
		String[] colors1= {"red","blue","pink","green"};
		
		System.out.println(colors1[3]);
		
		String[][] data1= { {"saul","saul123"} , {"kim","kim123"} , {"peter","peter123"} };
		
		System.out.println(data1[0][0]);
		System.out.println(data1[0][1]);
		
		System.out.println(data1[1][0]);
		System.out.println(data1[1][1]);
		
		System.out.println(data1[2][0]);
		System.out.println(data1[2][1]);
		
		String[][] data=new String[3][2];
		//i->number of testcase
		//j->number of parameters
		
		data[0][0]="saul";
		data[0][1]="saul123";
		
		data[1][0]="kim";
		data[1][1]="kim123";
		
		data[2][0]="peter";
		data[2][1]="peter123";
		
		System.out.println(data[0][0]);
		System.out.println(data[0][1]);
		
		System.out.println(data[1][0]);
		System.out.println(data[1][1]);
		
		System.out.println(data[2][0]);
		System.out.println(data[2][1]);
	}

}
