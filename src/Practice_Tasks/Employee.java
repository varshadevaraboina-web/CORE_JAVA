package Practice_Tasks;

public class Employee {
	int id;
	String name;
	double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {

		Employee e = new Employee(101, "varsha", 100000);
		System.out.println("Employee Details");
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);

	}

}
