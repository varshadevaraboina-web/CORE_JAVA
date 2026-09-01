package com.javaintro;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started");
		System.out.println("Good Morning !! Have a nice day !");
		
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
		Class.forName("com.javaintro.Welcome");
		Class.forName("com.mysql.cj.jdbc.Driver");

		System.out.println("main method ended");

	}

}
