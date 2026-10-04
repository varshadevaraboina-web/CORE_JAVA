package Practice_Tasks;

class ParentClass {
    void display() {
        System.out.println("Parent method");
    }
}

public class Child1 extends ParentClass {
    void display() {
        System.out.println("Child method");
        super.display();
    }

    public static void main(String[] args) {
        Child1 c = new Child1();
        c.display();
    }
}