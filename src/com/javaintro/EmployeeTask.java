package com.javaintro;

public class EmployeeTask {
	
	    byte empId;
		String empName;
		int empSalary;
		
		void displayDetails() {
			
			System.out.println("ID:" +" "+ empId);
			System.out.println("Name:" +" "+ empName);
	        System.out.println("Salary:" +" "+ empSalary);
	        System.out.println("");
			
			}
		
	    public static void main(String[] args) {
	    	
		EmployeeTask e1=new EmployeeTask();
		System.out.println("Employee Details");
		System.out.println("-----------------");
		e1.empId=101;
		e1.empName="varsha";
		e1.empSalary=30000;

		EmployeeTask e2=new EmployeeTask();
		e2.empId=102;
		e2.empName="Harika";
		e2.empSalary=25000;
		
        EmployeeTask e3=new EmployeeTask();
		e3.empId=103;
		e3.empName="Akshaya";
		e3.empSalary=23000;
		
		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
		
		

	}

}
