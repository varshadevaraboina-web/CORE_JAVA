package com.javaintro;

public class Largest_value {
	
	int a=30;
	int b=20;
	int c=40;
	void compare() {
		if(a>b ||a>c || b>c) {
			System.out.println("a is greater than b:" +a);
			
			}
		else {
			System.out.println("b is greater than a:" +b);
		}
		
		
	}
	
public static void main(String[] args) {
	Largest_value l=new Largest_value();
	l.compare();
		
	}

}
