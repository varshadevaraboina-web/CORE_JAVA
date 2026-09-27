package Practice_Tasks;

public class TestConstructors {

	int id;
	String name;
	int age;
	char gender;
	int phoneNumber;
	String location;

	TestConstructors() {
		this(101);

	}

	TestConstructors(int id) {
		this(id, "varsha");

	}

	TestConstructors(int id, String name) {
		this(id, name, 22);

	}

	TestConstructors(int id, String name, int age) {
		this(id, name, age, 'F');

	}

	TestConstructors(int id, String name, int age, char gender) {
		this(id, name, age, gender, 630223496);

	}

	TestConstructors(int id, String name, int age, char gender, int phoneNumber) {
		this(id, name, age, gender, phoneNumber, "Pembarthi");

	}

	TestConstructors(int id, String name, int age, char gender, int phoneNumber, String location) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.location = location;

	}

	void display() {
		System.out.println("My Details");
		System.out.println("----------------");
		System.out.println("id:" + " " + id);
		System.out.println("name:" + " " + name);
		System.out.println("age:" + " " + age);
		System.out.println("gender:" + " " + gender);
		System.out.println("phoneNumber:" + " " + phoneNumber);
		System.out.println("location:" + " " + location);

	}

	public static void main(String[] args) {
		TestConstructors t = new TestConstructors();
		TestConstructors t1 = new TestConstructors();
		TestConstructors t2 = new TestConstructors(101);
		TestConstructors t3 = new TestConstructors(101, "varsha");
		TestConstructors t4 = new TestConstructors(101, "varsha", 22);
		TestConstructors t5 = new TestConstructors(101, "varsha", 22, 'F');
		TestConstructors t6 = new TestConstructors(101, "varsha", 22, 'F', 630223496);
		TestConstructors t7 = new TestConstructors(101, "varsha", 22, 'F', 630223496, "Pembarthi");

		t.display();

	}

}
