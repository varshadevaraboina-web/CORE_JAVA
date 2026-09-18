package com.javaintro;

import java.util.Scanner;

public class TestScanner1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter your name");
		String name = sc.next();
        System.out.println("Enter your roll number");
		int a = sc.nextInt();
		System.out.println("Enter your Gender");
		char gender = sc.next().charAt(0);
		
		System.out.println("Name:" + name);
		System.out.println("Roll Number:" + a);
        System.out.println("Gender:" + gender);
        sc.close();
        
        System.out.println("Main method ended");

	}

}
