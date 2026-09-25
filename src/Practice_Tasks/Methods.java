package Practice_Tasks;

import java.util.Scanner;

public class Methods {
	static Scanner sc = new Scanner(System.in);

	// no return no arg
	void division() {
		int a = 6, b = 3;
		int quotient = a / b;
		System.out.println("Division of two numbers");
		System.out.println(quotient);
	}

	// return with arg
	int square(int s) {
		int area = s * s;
		return area;

	}

	// return with arg
	double triangle(int length, int breath) {
		double area = 0.5 * length * breath;
		return area;

	}

	// return with arg
	static double circle(int r) {
		double area = Math.PI * r * r;
		return area;

	}

	// no return with arg
	void addition(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of two numbers");
		System.out.println(sum);

	}

	// no return with arg
	void subtraction(int a, int b) {
		int c = a - b;
		System.out.println("Difference of two numbers");
		System.out.println(c);

	}

	// return no arg
	int multiplication() {
		int a = 3, b = 7;
		return a * b;

	}

	public static void main(String[] args) {

		Methods m = new Methods();
		int s = m.square(3);
		System.out.println("Area of square");
		System.out.println(s);

		System.out.println();

		double t = m.triangle(6, 3);
		System.out.println("Area of Triangle");
		System.out.println(t);
		System.out.println();

		System.out.println("Enter value of radius");
		int r = sc.nextInt();
		double area = circle(r);
		System.out.println(area);
		System.out.println();

		m.addition(3, 6);
		System.out.println();

		m.subtraction(3, 6);
		System.out.println();

		int m1 = m.multiplication();
		System.out.println("Multiplication");
		System.out.println(m1);
		System.out.println();

		m.division();

	}

}
