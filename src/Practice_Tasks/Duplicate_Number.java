package Practice_Tasks;

public class Duplicate_Number {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 10;
        
        System.out.println("The value of a is:"+" "+a);
        System.out.println("The value of b is:"+" "+b);
        System.out.println("The value of c is:"+" "+c);
        System.out.println();

        if (a == b) {
            System.out.println("Duplicate value is:" + a);
        }
        else if (a == c) {
            System.out.println("Duplicate value is:" + a);
        }
        else if (b == c) {
            System.out.println("Duplicate value is:" + b);
        }
        else {
            System.out.println("No duplicate");
        }
    }
}