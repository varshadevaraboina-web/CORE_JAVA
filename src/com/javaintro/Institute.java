package com.javaintro;

public class Institute {
	
	//static variables
			static String TrainerName1="Srikanth";
			static String TrainerName2="Vishwa";
			
			//instance variables
			String EmployeeName;
			int EmployeeId;
			String Designation;
			
			public static void main(String[] args) {
				Institute i=new Institute();
				 i.EmployeeName="varsha";
				i.EmployeeName="varsha";
			    i.EmployeeId=101;
                i.Designation="JSF";
                
                System.out.println("TrainerName1 :" + TrainerName1);
                System.out.println("TrainerName2 :" + TrainerName2);
                System.out.println("EmployeeName :" + i.EmployeeName );
                System.out.println("EmployeeId :" + i.EmployeeId );
                System.out.println("Designation :" + i.Designation );
	}

}
