package com.inheritance;

class vehicles {
	private String name;
	private int price;

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setPrice(int price) {
		this.price = price;
	}

	int getPrice() {
		return price;
	}

	void displayDetails() {
		System.out.println(getName());
		System.out.println(getPrice());
	}

}

class car extends vehicles{
	
	String model;
	int speed;
	
	void displayDetails() {
		System.out.println(model);
		System.out.println(speed);
		System.out.println(getName());
		System.out.println(getPrice());
	}
	
}

public class Main {

	public static void main(String[] args) {

		car c=new car();
		
		c.model="Royal";
		c.speed=120;
		c.setName=("Car");
		c.setPrice=(1500000);

	}

}
