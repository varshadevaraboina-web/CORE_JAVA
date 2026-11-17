
package com.inheritance;

public class Vehicle {

	int speed = 50;

	void display() {
		System.out.println("Vehicle speed: " + speed);
	}
	public static void main(String[] args) {

		Vehicle v1 = new Car();

		System.out.println(v1.speed);

		v1.display();
	}
}

class Car extends Vehicle {

	int speed = 100;

	@Override
	void display() {
		System.out.println("Car speed: " + speed);
	}
}


