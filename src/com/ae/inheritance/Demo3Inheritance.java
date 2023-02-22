package com.ae.inheritance;

abstract class Employee
{
	public String empName;
	public double empSalary;
	
	public void getName()
	{
		System.out.println(empName);
	}
	
	public void getSalary()
	{
		System.out.println(empSalary);
	}
	
	public abstract void calculateSalary(double effort);
}

class ContractEmployee extends Employee
{


	public void calculateSalary(double effort) {
		// TODO Auto-generated method stub
		super.empSalary=effort*800*8;
	}

	public void getSalary()
	{
		System.out.println("Contract Employee Sal"+empSalary);
	}
	
}

class PermanentEmployee extends Employee
{
	public void calculateSalary(double effort)
	{
		super.empSalary=effort*500*30;
	}
	
	public void getSalary()
	{
		System.out.println("Permanent Employee Sal"+empSalary);
	}
}




public class Demo3Inheritance {

	public static void main(String[] args) {
		
		Employee emp1=new ContractEmployee();
		emp1.empName="john";
		
		emp1.calculateSalary(9);
		emp1.getName();
		emp1.getSalary();
		
		Employee emp2=new PermanentEmployee();
		emp2.empName="peter";
		
		emp2.calculateSalary(9);
		emp2.getName();
		emp2.getSalary();
		
	}
}
