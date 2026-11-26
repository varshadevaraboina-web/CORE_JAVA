package com.abstraction;

import java.util.Scanner;

public class PizaOrder implements FoodOrder {
	
	{
		System.out.println("Piza is very tastey...");
	}

	@Override
	public void calculateBill() {
		String item="piza";
		int cost=120;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter quantity");
		int quantity=sc.nextInt();
		double totalBill=cost*quantity;
		System.out.println(totalBill);

	}

	@Override
	public void prepareOrder() {
		System.out.println("Pizza is ready...");

	}
}

class BurgerOrder implements FoodOrder {
	
	{
		System.out.println("Burger is looking too pluffyyy...");
	}

	@Override
	public void calculateBill() {
		String item="Burger";
		int cost=150;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter quantity");
		int quantity=sc.nextInt();
		double totalBill=cost*quantity;
		System.out.println(totalBill);

	}

	@Override
	public void prepareOrder() {
		System.out.println("Burger is ready...");

	}

}

class BiryaniOrder implements FoodOrder {
	
	{
		System.out.println("Hey! Hyderabad biryani is very famous");
	}

	@Override
	public void calculateBill() {
		String item="Dum Biryani";
		int cost=350;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter quantity");
		int quantity=sc.nextInt();
		double totalBill=cost*quantity;
		System.out.println(totalBill);

	}

	@Override
	public void prepareOrder() {
		System.out.println("oh! my god biryani is too spicy");

	}

}
