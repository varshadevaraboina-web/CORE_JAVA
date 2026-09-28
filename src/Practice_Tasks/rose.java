package Practice_Tasks;

class flower {
	String name;
	String colour;
	int cost;
	{
		System.out.println("Practicing constructors");
	}

	flower() {
		System.out.println("parent class");
		System.out.println(" ");
	}

	public static void main(String[] args) {

	}

}

public class rose extends flower {
	rose(String name, String colour, int cost) {
		super.name = name;
		super.colour = colour;
		super.cost = cost;

	}

	public static void main(String[] args) {
		System.out.println("child class");
		System.out.println(" ");

		rose r = new rose("rose", "red", 15);

		r.roseInfo();

	}

	void roseInfo() {
		System.out.println("Flower Details");
		System.out.println("----------------");
		System.out.println("Name:" + " " + name);
		System.out.println("Colour:" + " " + colour);
		System.out.println("Cost:" + " " + cost);
	}

}
