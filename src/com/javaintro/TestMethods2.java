package com.javaintro;

public class TestMethods2 {

	static void evenOdd(int n) {
		if (n % 2 == 0) {
			System.out.println("Even Number");

		} else {
			System.out.println("Odd Number");
		}

	}

	static void Biggest(int a, int b) {
		if (a > b) {
			System.out.println("a is biggest");
		} else {

			System.out.println("b is biggest");
		}

	}

	static void square(int n) {
		System.out.println(n * n);

	}

	static void rectangle(int length, int breath) {
		System.out.println(length * breath);

	}

	static void Name(String name) {
		System.out.println("My name is:" + " " + name);

	}

	static void Address(String address) {
		System.out.println("Address:" + " " + address);

	}

	public static void main(String[] args) {

		evenOdd(3);
		Biggest(4, 7);
		Name("varsha");
		Address("Jangaon");
		square(3);
		rectangle(6, 3F);

	}

}
