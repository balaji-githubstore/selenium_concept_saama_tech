package com.ae.employees;

import com.ae.studentdetails.Student;

public class Employee {

	public int empId; // non-static variable or instance variable
	public String empName;
	public double empSalary;

	public static String companyName; // static variable or class variable
	public static String companyLocation;
	
	
	public static String getAuthorName() {
		String name = "Balaji Dinakaran";
		return name;
	}

	public void printEmployeeDetails() 
	{
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + empSalary);
		System.out.println("Company Name: " + Employee.companyName);
		System.out.println("Company Location: " + Employee.companyLocation);
		System.out.println("--------------------------------");
	}
	
	public static void displayEmployeeRecord(Employee z)
	{
		System.out.println("Employee Id: " + z.empId);
		System.out.println("Employee Name: " + z.empName);
		System.out.println("Employee Salary: " + z.empSalary);
		System.out.println("Company Name: " + Employee.companyName);
		System.out.println("Company Location: " + Employee.companyLocation);
		System.out.println("--------------------------------");
	}
	
	public static Employee getEmployeeInstance()
	{
		Employee emp=new Employee();
		return emp;
	}
	
//	public static void printStudentName(Student s)
//	{
//		System.out.println(s.mailId);
//	}

}
