package com.ae.mathformulae;

public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double result = Area.areaOfCircle(10);
		System.out.println(result);

		
		result = Area.areaOfCircle(20);
		System.out.println(result);
		
		
		double res=Area.areaOfRectange(10.2, 10.2);
		System.out.println(res);
		
		Area obj=new Area();
		
		double result2=obj.areaOfTriangle(25, 1);
		System.out.println(result2);
		
		obj.quit();
		
		double powRes=Math.pow(2, 3);
		System.out.println(powRes);
		
		double randomNumber=Math.random();
		System.out.println(randomNumber);
		
		
	}

}
