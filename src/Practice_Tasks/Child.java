package Practice_Tasks;


class Parent {
    int a = 10;
}

public class Child extends Parent {
    int a = 20;

    void display() {
        System.out.println("Child Class Variable:"+" "+a);
        System.out.println("Parent Class Variable:"+" "+super.a);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}