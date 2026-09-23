package com.javaintro;

public class EmployeeInfo {
	
	int eid;
	String name;
	double salary;
	
	
	EmployeeInfo(){
		}
	
	
	EmployeeInfo(int eid,String name,double salary){
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		System.out.println("parameterized constructor");
		System.out.println("Employee Details");
		System.out.println("Employee ID:"+" "+eid);
		System.out.println("Employee Name:"+" "+name);
		System.out.println("Employee Salary:"+" "+salary);
	
		}
	
	
	public static void main(String[] args) {
		
		EmployeeInfo e=new EmployeeInfo();
		e.eid=101;
		e.name="Ram";
		e.salary=100000;
		
		System.out.println("No-Argment constructor");
		System.out.println("Employee Details");
		System.out.println("Employee ID:"+" "+e.eid);
		System.out.println("Employee Name:"+" "+e.name);
		System.out.println("Employee Salary:"+" "+e.salary);
		System.out.println("");
		
		
		EmployeeInfo e1=new EmployeeInfo(103,"varsha",50000);
		
		
	}

}
