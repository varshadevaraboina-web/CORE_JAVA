package com.javaintro;

public class MethodTest {
	
	
	//static variables
	static String TrainerName1="Srikanth";
	static String TrainerName2="Vishwa";
	
	void show() {
		String EmployeeName="varsha";
		int EmployeeId=101;
		String Designation="JSF";
		System.out.println("TrainerName1 :" + TrainerName1);
        System.out.println("TrainerName2 :" + TrainerName2);
        System.out.println("EmployeeName :" + EmployeeName );
        System.out.println("EmployeeId :" + EmployeeId );
        System.out.println("Designation :" + Designation );
	
	}
	public static void main(String[] args) {
		MethodTest i=new MethodTest();
		 i.show();     
        
        
         
	}
	

}



