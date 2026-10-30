package Practice_Tasks;

import java.util.Scanner;

public class SwitchCases {

	static int quantity;
	static double price;
	static double total;
	static String item;

	public static void main(String[] args) {

		System.out.println("WEL COME TO OUR RESTRAUNT");
		System.out.println("**************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Pizza");
		System.out.println("2.Burger");
		System.out.println("3.Biryani");
		System.out.println("4.Noodles");
		System.out.println("Enter item");
		int choice = sc.nextInt();

		switch (choice) {
		case 1 -> {
			item = "Pizza";
			price = 200;
		}
		case 2 -> {
			item = "Burger";
			price = 120;
		}

		case 3 -> {
			item = "Biryani";
			price = 180;
		}

		case 4 -> {
			item = "Noodles";
			price = 100;
		}

		default -> {System.out.println("Invalid Choice");
		return;
		}
		}
		System.out.println("Enter quantity");
		quantity = sc.nextInt();
		total = price * quantity;
		System.out.println(total);
		System.out.println("Item:"+item);
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+quantity);
		System.out.println("Total Bill:"+total);
		System.out.println("Thank you! for wisiting our restraunt");
	}

}
