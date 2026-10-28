package Practice_Tasks;

import java.util.Scanner;

public class IfElse1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("The number is positive");
			if (a % 2 == 0) {
				System.out.println("Number is even");

			} else {
				System.out.println("Number is odd");
			}

		} else {
			System.out.println("Number is negative");
		}

	}

}
