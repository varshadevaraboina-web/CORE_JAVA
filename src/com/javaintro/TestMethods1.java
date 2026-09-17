package com.javaintro;

public class TestMethods1 {

	void addition(int a, int b) {
		System.out.println("Addition");
		int result = a + b;
		System.out.println(result);
		System.out.println("");

		subtraction(result, 5);

	}

	void subtraction(int a, int b) {
		System.out.println("Subtraction");
		int result = a - b;
		System.out.println(result);
		System.out.println("");

		multiplication(result, 3);

	}

	void multiplication(int a, int b) {
		System.out.println("Multiplication");
		int result = a * b;
		System.out.println(result);
		System.out.println("");

		division(result, 2);

	}

	void division(int a, int b) {
		System.out.println("Division");
		int result = a / b;
		System.out.println(result);

	}

	public static void main(String[] args) {

		TestMethods1 t = new TestMethods1();
		t.addition(30, 20);

	}

}
