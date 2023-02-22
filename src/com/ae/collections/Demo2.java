package com.ae.collections;

import java.util.ArrayList;

import com.ae.employees.Employee;

//non-generic type 
public class Demo2 {


	public static void main(String[] args) {
		
		
		ArrayList lists=new ArrayList();
		
		lists.add(10); //boxing
		lists.add(45.5); //boxing
		lists.add("hello"); //boxing
		lists.add(new Employee()); //boxing
		
		int res= (int) lists.get(0); //unboxing
		
		
	}
}
