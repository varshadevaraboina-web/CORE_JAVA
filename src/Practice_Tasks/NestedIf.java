package Practice_Tasks;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("     WELCOME TO MATRIMON");
        System.out.println("================================");

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Enter your assets: ");
        int asset = sc.nextInt();

        if (asset > 50000000) {

            System.out.println("\nAssets criteria satisfied!");
            System.out.println("Let's proceed with this conversation.");

            System.out.print("\nEnter your salary: ");
            double sal = sc.nextDouble();

            if (sal > 2400000) {

                System.out.println("Salary criteria satisfied!");
                System.out.println("We are looking forward to proceeding.");

                System.out.print("\nEnter your age: ");
                int age = sc.nextInt();

                if (age > 26 && age < 30) {

                    System.out.println("Age criteria satisfied!");
                    System.out.println("Good to hear!");

                    System.out.print("\nEnter your height in feet: ");
                    float height = sc.nextFloat();

                    System.out.print("Enter your weight in kg: ");
                    double weight = sc.nextDouble();

                    if ((height > 5.2 && height < 6.2)
                            && (weight > 65 && weight < 75)) {

                        System.out.println("\n================================");
                        System.out.println("       CONGRATULATIONS!");
                        System.out.println("================================");
                        System.out.println("All criteria are satisfied.");
                        System.out.println("We are excited to move forward!");

                    } else {

                        System.out.println("\nHeight or weight criteria not satisfied.");

                    }

                } else {

                    System.out.println("\nAge criteria not satisfied.");

                }

            } else {

                System.out.println("\nSalary criteria not satisfied.");

            }

        } else {

            System.out.println("\nAssets criteria not satisfied.");

        }

        System.out.println("\nThank you for using our Matrimon service!");

        sc.close();
    }
}

