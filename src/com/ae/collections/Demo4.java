package com.ae.collections;

import java.util.ArrayList;
import java.util.List;

import com.ae.employees.Employee;
//generic type
public class Demo4 {


	public static void main(String[] args) {
		
//		ArrayList<String> lists=new ArrayList<String>();
		
		List<Double> lists=new ArrayList<Double>();
		
		lists.add(98.3);
		lists.add(98.0);
		lists.add(6.5);
		
		System.out.println(lists.size());
		lists.remove("blue");
		lists.remove(1);
		System.out.println(lists.size());
		
		System.out.println(lists);
//		System.out.println(lists.get(0));
//		System.out.println(lists.get(1));
		
	}
}
