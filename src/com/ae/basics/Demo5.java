package com.ae.basics;

public class Demo5 {
	
	public static void main(String[] args) {
		
		String expectedName="Saul";
		
		String xpath="//h6[normalize-space()='"+expectedName+"']";
		
		System.out.println(xpath);
		
		System.out.println("Hello "+expectedName+" kinf");
	}

}
