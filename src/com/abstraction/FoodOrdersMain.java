package com.abstraction;

public class FoodOrdersMain {

	public static void main(String[] args) {
		
		FoodOrder f = new PizaOrder();
		f.calculateBill();
		f.prepareOrder();
		
		
		FoodOrder f1 = new BurgerOrder();
		f1.calculateBill();
		f1.prepareOrder();
		
		
		FoodOrder f2 = new BiryaniOrder();
		f2.calculateBill();
		f2.prepareOrder();
		
	}

}
