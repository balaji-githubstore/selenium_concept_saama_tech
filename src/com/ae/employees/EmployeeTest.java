package com.ae.employees;

public class EmployeeTest {

	public static void main(String[] args) {

		System.out.println(Employee.companyName);
		System.out.println(Employee.companyLocation);

		Employee.companyName = "Saama Tech";
		Employee.companyLocation = "Pune";

		Employee.companyName = "Saama Techologies";

		System.out.println(Employee.companyName);
		System.out.println(Employee.companyLocation);

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		Employee emp4=Employee.getEmployeeInstance();
		Employee emp5=Employee.getEmployeeInstance();

		emp1.empId = 101;
		emp1.empName = "Saul";
		emp1.empSalary = 8000.2;

		emp2.empId = 102;
		emp2.empName = "kim";
		emp2.empSalary = 5000;
		
		
		String authorName=Employee.getAuthorName();
		System.out.println(authorName);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		emp2.printEmployeeDetails();
		emp1.printEmployeeDetails();
		emp3.printEmployeeDetails();
		
		Employee.displayEmployeeRecord(emp2); 
		
		
		emp1.printEmployeeDetails();
		Employee.displayEmployeeRecord(emp1);
	}

}
