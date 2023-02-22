package com.ae.mathformulae;

public class Area {

	// area of circle
	// area of rectangle
	// area of triangle

	public static double areaOfCircle(int radius) {
		double res = 3.14 * radius * radius;
		return res;
	}

	public static double areaOfRectange(double length, double width) {
		return length * width;
	}

	// create a method for area of triangle
	public double areaOfTriangle(double base, double height) {
		return (base * height) / 2;
	}
	
	public void quit()
	{
		
	}

}
