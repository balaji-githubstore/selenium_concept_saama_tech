package com.ae.studenttest;

import com.ae.studentdetails.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		Student.schoolName="TataTech School";
		Student.schoolAddress="Pune";
		
		Student stu1=new Student(101);
		Student stu2=new Student(102.2);
		Student stu3=new Student(103,"John");
		Student stu4=new Student();
		
		//stu1.id=1001;
		stu1.name="saul";
		stu1.percentage=90;
		stu1.mailId="saul@gmail.com";
		
		//stu2.id=1002;
		stu2.name="peter";
		stu2.percentage=45;
		stu2.mailId="peter@gmail.com";
		
		stu1.printStudentDetails();
		stu2.printStudentDetails();
		
		stu1.provideCertification();
		stu2.provideCertification();
		
		stu3.provideCertification();
		
		
//		System.out.println(Math.PI);
//		
//		double res= Math.sqrt(9);
//		System.out.println(res);
		
	}
}
