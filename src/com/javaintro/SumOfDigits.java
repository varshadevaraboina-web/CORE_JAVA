package com.javaintro;

public class SumOfDigits {
    public static void main(String[] args) {
        int n=1234;
        int num = 1234;
        int sum = 0;

        while (num != 0) {

            int digit = num % 10;

            sum = sum + digit;

            num = num / 10;
        }
System.out.println("The number is:"+" "+n);
        System.out.println("Sum of digits = " + sum);
    }
}