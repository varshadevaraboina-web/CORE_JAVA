package Practice_Tasks;

public class Vehicles {

	String name;
	int speed;

	Vehicles(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	void start() {
		System.out.println(name + " " + "is starting");

	}

	void stop() {
		System.out.println(name + " " + "is stoping");

	}

	public static void main(String[] args) {

		Cars c = new Cars("BMW", 120);
		Bikes b = new Bikes("Hero Honda", 100);
		Trucks t = new Trucks("Tata", 80);

		System.out.println("Car details");
		System.out.println("-------------");
		c.start();
		System.out.println(c.name + " " + "speed:" + c.speed);
		c.openSunproof();
		c.stop();
		System.out.println();

		System.out.println("Bike details");
		System.out.println("-------------");
		b.start();
		System.out.println(b.name + " " + "speed:" + b.speed);
		b.doWheelie();
		b.stop();
		System.out.println();

		System.out.println("Truck details");
		System.out.println("-------------");
		t.start();
		System.out.println(t.name + " " + "speed:" + t.speed);
		t.loadCargo();
		t.stop();
	}

}

class Cars extends Vehicles {

	Cars(String name, int speed) {
		super(name, speed);
	}

	void openSunproof() {
		System.out.println("Car sunproof is opening ");

	}

}

class Bikes extends Vehicles {

	Bikes(String name, int speed) {
		super(name, speed);

	}

	void doWheelie() {
		System.out.println("Bike is doing wheelie");

	}
}

class Trucks extends Vehicles {

	Trucks(String name, int speed) {
		super(name, speed);
	}

	void loadCargo() {
		System.out.println("Truck is loading cargo ");

	}

}
