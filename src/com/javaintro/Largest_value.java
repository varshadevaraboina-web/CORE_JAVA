
package com.javaintro;

public class Largest_value {
	
    public static void main(String[] args) {

        int a = 10;
        int b = 25;
        int c = 16;

        if (a > b && a > c) {
            System.out.println("a is largest: " + a);
        }
        else if (b > a && b > c) {
            System.out.println("b is largest: " + b);
        }
        else {
            System.out.println("c is largest: " + c);
        }
    }
}