package com.abstraction;

abstract class Payment {
	public abstract void makePayment();

	void displayMessage() {

		System.out.println("well come to paymeny system...");
	}

}

class UPIPayment extends Payment {

	@Override
	public void makePayment() {
		System.out.println("Payment done through UPT");

	}

}

class CreditCardPayment extends Payment {

	@Override
	public void makePayment() {
		System.out.println("Payment done through CreditCard");

	}

}

class NetBankingPayment extends Payment {

	@Override
	public void makePayment() {
		System.out.println("Payment done through NetBanking");

	}

}

public class MainPaymentClass {

	public static void main(String[] args) {

		Payment p = new UPIPayment();
		p.displayMessage();
		p.makePayment();
		System.out.println();

		p = new CreditCardPayment();
		p.displayMessage();
		p.makePayment();
		System.out.println();

		p = new NetBankingPayment();
		p.displayMessage();
		p.makePayment();

	}

}
