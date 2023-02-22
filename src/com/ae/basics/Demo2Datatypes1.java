package com.ae.basics;

import java.io.InputStream;
import java.util.Scanner;

public class Demo2Datatypes1 {
	
	public static void main(String[] args) {

		
		byte a=0; //a is registered to byte - 8 bits
		
//		a=120;
		short b=100; //16 bits 
		int c=100;//32 bits 
		long percent=98989898989L; //long //64 bit
		
		int result= c+c;
		System.out.println("the result is "+result);
		
		//percent - 0 to 100 
		//1000 students - byte - 1000*8 bits =8000 bits of memory occupied
		//1000 students - int - 1000*32 bits = 32000 bits of memory occupied 
		
		float e=10.2f; //32 bits
		double f=10.2; //64 bits
		
		char letter='b'; //16 bits
		
		boolean check=true;//1 bit
	
		System.out.println(10.2);
		System.out.println(b);
		System.out.println(c);
		System.out.println(percent);
		
		System.out.println(e);
		System.out.println(f);
		
		
		//non-predefined 
		String myName="Balaji";  //6*16 bits 
		
		System.out.println(myName);
		
		System.out.println(myName.charAt(2));
		
		
	}
}
