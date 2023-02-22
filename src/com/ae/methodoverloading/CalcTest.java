package com.ae.methodoverloading;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		cal.add(4, 4.2);
		
		double res=Math.max(10.2f, 10.3f);
		System.out.println(res);
	}

}
