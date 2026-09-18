package com.javaintro;

public class BankAccount1 {
	static double amount = 1000;

	static void deposit(double credit) {
		double balance = amount + credit;
		System.out.println("Balance:"+amount);
		System.out.println("");
		System.out.println("Your A/C is Credited for Rs:" + credit);
		System.out.println("Avl Bal :" + balance);
		System.out.println("");
		withdraw( balance,530);
	}
	
	static void withdraw(double balance,double debit) {
		double Balance = balance-debit;
		System.out.println("Your A/C is debited Rs:" +debit );
		System.out.println("Avl Bal :" + Balance);


	}

	public static void main(String[] args) {
		deposit(1000);
		

	}

}
