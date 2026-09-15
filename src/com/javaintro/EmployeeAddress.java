package com.javaintro;

class course{
	String courseName="JAVA_FullStack";
	}

 class Address{
	String name="varsha";
	int rollno=103;
	String address="Hyd";
	}

public class EmployeeAddress {
	String empName="Ram";
	byte empId=124;
	int sal=50000;
	Address a=new Address();
	course c=new course();
	
	public static void main(String[] args) {
		EmployeeAddress e=new EmployeeAddress();
		System.out.println("Employee Details");
		System.out.println("Name:" +" "+e.empName);
		System.out.println("ID:" +" "+e.empId);
		System.out.println("Salary:" +" "+e.sal);
		System.out.println(" ");
		System.out.println("Student Details");
		System.out.println("Name:" +" "+e.a.name);
		System.out.println("Roll Number:" +" "+e.a.rollno);
		System.out.println("Address:" +" "+e.a.address);
		System.out.println("courseName:" +" "+e.c.courseName);

	}

}
