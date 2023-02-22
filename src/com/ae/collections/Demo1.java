package com.ae.collections;

import java.util.ArrayList;

import com.ae.employees.Employee;


public class Demo1 {

	public static void main(String[] args) {
		
		int a=10;
		double b=10.2;
		String c="hello";
		
		Employee e=new Employee();
		
		
		Object v=a; //boxing
		
		int j=(int) v; //unboxing 
		System.out.println(j+j);
	
		
		Object[] arr=new Object[4];
		arr[0]=a; //boxing 
		arr[1]=e;
		
		
//		String x= (String) arr[0]; //unboxing 
//		System.out.println(x);
		
	
		
		
		
		Employee e1= (Employee) arr[1];
		e1.printEmployeeDetails();
		
		
	}
}
