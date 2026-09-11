package com.javaintro;

public class PencilCost {
	
	void task() {
		
		byte money=100;
		byte price=7;
		
		int totalPencils=money/price;
		int balance=money-totalPencils*price;
		
		System.out.println("Total money:" +" "+money);
		System.out.println("price:" +" "+price);
		System.out.println("totalPencils:" +" "+totalPencils);
		System.out.println("balance:" +" "+balance);
		
		}
	   public static void main(String[] args) {
		   PencilCost p=new PencilCost();
		   p.task();
		
	}

}
