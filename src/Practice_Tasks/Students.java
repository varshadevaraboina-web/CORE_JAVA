package Practice_Tasks;

class Person {

    String name;
    String location;
    int age;

    Person(String name) {
        this.name = name;
    }

    Person(String name, String location) {
        this.name = name;
        this.location = location;
    }

    Person(String name, String location, int age) {
        this.name = name;
        this.location = location;
        this.age = age;
    }

    void display() {
    	System.out.println("Student Information");
    	System.out.println("---------------------");
        System.out.println("Name:"+" "+name);
        System.out.println("Location:"+" "+location);
        System.out.println("Age:"+" "+age);
    }
}

public class Students extends Person {

    Students() {
        super("varsha");
        System.out.println("no arg constructor in child class");
    }

    Students(String name) {
        super(name, "hyd");
    }

    Students(String name, String location) {
        super(name, location, 22);
    }

    Students(String name, String location, int age) {
        super(name, location, age);
    }

    public static void main(String[] args) {

        Students s = new Students("Varsha", "Hyderabad", 22);

        s.display();
    }
}