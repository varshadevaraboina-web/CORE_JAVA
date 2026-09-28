package Practice_Tasks;

import java.util.Scanner;

public class MobileBill {
	static Scanner sc = new Scanner(System.in);

	String mobileModel;
	double price;
	int quantity;
	double deliveryCharge;

	MobileBill() {
		this("Realme C25");
	}

	MobileBill(String mobileModel) {
		this(mobileModel, 50000.00);
	}

	MobileBill(String mobileModel, double price) {
		this(mobileModel, price, 1);
	}

	MobileBill(String mobileModel, double price, int quantity) {
		this(mobileModel, price, quantity, 250);
	}

	MobileBill(String mobileModel, double price, int quantity, double deliveryCharge) {

		this.mobileModel = mobileModel;
		this.price = price;
		this.quantity = quantity;
		this.deliveryCharge = deliveryCharge;
	}

	void mobileDisplay() {

		System.out.println("Mobile Information");
		System.out.println("-------------------");

		System.out.println("Mobile Model: " + mobileModel);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);

		double mobileCost = price * quantity;

		System.out.println("Mobile Cost: " + mobileCost);
		System.out.println("Delivery Charge: " + deliveryCharge);

		double finalBill = mobileCost + deliveryCharge;

		System.out.println("Final Bill: " + finalBill);
	}

	public static void main(String[] args) {

		
		System.out.print("Enter Mobile Model: ");
		String mobileModel = sc.next();

		System.out.print("Enter Price: ");
		double price = sc.nextDouble();

		System.out.print("Enter Quantity: ");
		int quantity = sc.nextInt();

		System.out.print("Enter Delivery Charge: ");
		double deliveryCharge = sc.nextDouble();

		MobileBill m = new MobileBill(mobileModel, price, quantity, deliveryCharge);

		m.mobileDisplay();

		sc.close();
	}
}