package com.ae.inheritance;

class Father1
{
	public int fAge=65;
	
	public Father1(int fAge)
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

class Son1 extends Father
{
	public int sAge=20;
	
	public Son1(int fAge,int sAge)
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
		System.out.println("from son");
	}
}

class GrandSon1 extends Son
{
	public GrandSon1(int fAge, int sAge) {
		super(fAge, sAge);
		// TODO Auto-generated constructor stub
	}

	public void method1()
	{
		System.out.println("from gggson");
	}
}



public class Demo2Inheritance {

	public static void main(String[] args) {
		
		
		Son1 obj=new Son1(64,19);
		System.out.println(obj.fAge);
		System.out.println(obj.sAge);
		
		obj.fatherStyle();
		obj.sonStyle();
		obj.method1();
		
		GrandSon1 g=new GrandSon1(45, 5);
		g.method1();
		
	}

}
