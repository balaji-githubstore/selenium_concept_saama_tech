package com.ae.studentdetails;

public class Student {
	
	private int id;
	public String name;
	public String mailId;
	public double percentage;
	public static String schoolName;
	public static String schoolAddress;
	private static int counter=1001;

	public Student() 
	{
		System.out.println("browser created!!");
		id = counter;
		counter=counter+1;
	}
	
	public Student(int id)
	{
		if(id>100)
		{
			this.id=id;
		}
		else
		{
			System.out.println("Invalid Id supplied!!");
		}
	}
	
	public Student(int id,String name)
	{
		if(id>100)
		{
			this.id=id;
		}
		else
		{
			System.out.println("Invalid Id supplied!!");
		}
		
		 this.name=name;
	}
	
	public Student(String name,int id)
	{
		if(id>100)
		{
			this.id=id;
		}
		else
		{
			System.out.println("Invalid Id supplied!!");
		}
	}
	
	public Student(double id)
	{

	}
	
	
	public void printStudentDetails() {
		System.out.println("----------------------------");

		System.out.println(id);
		System.out.println(name);
		System.out.println(mailId);
		System.out.println(percentage);
		System.out.println(Student.schoolName);
		System.out.println(Student.schoolAddress);
		System.out.println("----------------------------");
	}

	public void provideCertification() {
		System.out.println("Hi " + name);
		if (percentage >= 90) {
			System.out.println("congrats! You have scored grade A");
		} else if (percentage >= 70 && percentage <= 89) {
			System.out.println("congrats! You have scored grade B");
		} else {
			System.out.println("Failed! Please reattempt!!!");
		}
		System.out.println("----------------------------");
	}
}
