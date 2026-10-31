package Practice_Tasks;

import java.util.Scanner;

public class Switch {

	public static void main(String[] agrs) {

		Scanner sc = new Scanner(System.in);
		String yn = "";

		do {

			System.out.println("Enter a value");
			int a = sc.nextInt();

			System.out.println("Enter b value");
			int b = sc.nextInt();

			System.out.println("Enter a symbol like +,-,*,/,%");
			char opr = sc.next().charAt(0);

			switch (opr) {
			case '+' -> System.out.println("sum of two numbers:" + a + b);
			case '-' -> System.out.println("Difference of two numbers:" + (a - b));
			case '*' -> System.out.println("Product of two numbers:" + a * b);
			case '/' -> System.out.println("Quatiet of two numbers:" + a / b);
			case '%' -> System.out.println("Remainder of two numbers:" + a % b);
			default -> System.out.println("Invalid symbol!");
			}

			System.out.println("do you want to continue click y for yes or click n for no");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
		
		System.out.println("Calculation closed!");

	}

}
