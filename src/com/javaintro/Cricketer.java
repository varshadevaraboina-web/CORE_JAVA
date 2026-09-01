package com.javaintro;

public class Cricketer {
	
	//Declaration
	
	//static variables
	static int countryId;
	static String countryName;
	
	//instance variables
	int jerseyNumber;
	String cricketerName;

	public static void main(String[] args) {
		System.out.println("Welcome  to Indian Cricket team");
		
		//Initilization the values
		countryId=91;
		countryName="India";
		
		//Accessing the data 
		System.out.println(countryId); //0
		System.out.println(countryName); //null
		
	}

}
