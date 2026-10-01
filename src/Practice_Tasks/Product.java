package Practice_Tasks;

public class Product {

	int pId;
	String pName;
	double price;
	int quantity;

	Product(int pId, String pName, double price, int quantity) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;

	}

	public Product(Product p1) {
		this.pId = p1.pId;
		this.pName = p1.pName;
		this.price = p1.price;
		this.quantity = p1.quantity;
	}

	double calculateTotal() {

		return price * quantity;
	}

	void display() {

		System.out.println("ID:" + " " + pId);
		System.out.println("Name:" + " " + pName);
		System.out.println("Price:" + " " + price);
		System.out.println("Quantity:" + " " + quantity);
		System.out.println("Total Price:" + " " + calculateTotal());
		System.out.println();
	}

	public static void main(String[] args) {

		Product p1 = new Product(101, "laptop", 50000, 1);
		
		
		System.out.println("Product Details");
		System.out.println("****************");
		System.out.println();
		Product p2 = new Product(p1);
		p2.quantity = 3;

		System.out.println("Product 1:");
		System.out.println("-----------");
		p1.display();

		System.out.println("Product 2");
		System.out.println("-----------");
		p2.display();

	}

}
