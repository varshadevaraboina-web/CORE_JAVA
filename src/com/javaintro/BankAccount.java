package com.javaintro;

public class BankAccount {
	//Instance Variables
	int Accountno;
	String AccountHolderName;
	double Balance;
	//Static variable
	static int  AccountNoGenerater=1000;
	//Instance Initializer Block
	{
		AccountNoGenerater++;
		Accountno=AccountNoGenerater;
		
	}
	
	public static void main(String[] args) {
		
		BankAccount b1=new BankAccount();
		BankAccount b2=new BankAccount();
		BankAccount b3=new BankAccount();
		BankAccount b4=new BankAccount();

		
		System.out.println(b1.Accountno);
		System.out.println(b2.Accountno);
		System.out.println(b3.Accountno);
		System.out.println(b4.Accountno);

	}

}
