package com.ae.inheritance;

class Father
{
	public int fAge=65;
	
	public Father(int fAge)
	{
		this.fAge=fAge;
		System.out.println("father constructor");
	}
	
	public void fatherStyle()
	{
		System.out.println("father style");
	}
	
	public void method1()
	{
		System.out.println("from parent");
	}
}

class Son extends Father
{
	public int sAge=20;
	
	public Son(int fAge,int sAge)
	{
		super(fAge);
		this.sAge=sAge;
		System.out.println("Son constructor");
	}
	
	public void sonStyle()
	{
		System.out.println("son style");
	}
	
	public void method1()
	{
		System.out.println("from son - overriden method");
	}
}




public class Demo1Inheritance {

	public static void main(String[] args) {
		
	
		Father obj=new Son(64,19);
		obj.method1();
		obj.fatherStyle();
	
		
		
		System.out.println(obj.fAge);
//		System.out.println(obj.sAge);
		
		obj.fatherStyle();
//		obj.sonStyle();
		obj.method1();
		
		
	}

}
