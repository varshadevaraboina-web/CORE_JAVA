package com.javaintro;

public class Test3 {
	
	
	void show() {
		
		System.out.println("method1 executed");
	}
	static void show1() {
		Test3 t=new Test3();
		t.show();
		
		System.out.println("static block");
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		show1();
		
		System.out.println("main method ended");
		
		
	}

}
