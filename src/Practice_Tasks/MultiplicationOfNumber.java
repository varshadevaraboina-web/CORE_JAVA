package Practice_Tasks;

import java.util.Scanner;

public class MultiplicationOfNumber {


public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");
    int n = sc.nextInt();

    int result=0;

    for(int i = 1; i <= 10; i++) {

        result = n * i;

        System.out.println(n + " * " + i + " = " + result);
    }

    sc.close();
}


}
