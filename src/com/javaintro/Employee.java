package com.javaintro;

public class Employee {
	void task() {
		
	byte empId=103;
    short empAge=45;
	int empSal=50000;
	char empGrade='A';
	float experience=3.5f;
	boolean isActive=true;
	short leaves=46;
	long phone=6302234962L;
	
	System.out.println("Employee Details");
	System.out.println("----------------");
	System.out.println("EmpId:" +" "+empId);
	System.out.println("EmpAge:" +" "+empAge);
	System.out.println("EmpSal:" +" "+empSal);
	System.out.println("EmpGrade:"+" "+empGrade);
	System.out.println("Experience:" +" "+experience);
	System.out.println("IsActive:" +" "+isActive);
	System.out.println("phone:" +" "+phone);
	
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		e.task();
		
	}

}
