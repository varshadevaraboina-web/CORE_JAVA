package com.javaintro;

import java.util.Scanner;

public class Scanner_Methods {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		
		System.out.println("Enter radius  value");
		int r=sc.nextInt();
		
		double area=circle(r);
		System.out.println(area);
		
		
		int result=rectangle();
		System.out.println(result);
		}
	
	//Area of rectangle
	//return + no parameters
	static int rectangle() {
		
		System.out.println("Enter length value");
		int length=sc.nextInt();
		
		System.out.println("Enter length value");
		int breath=sc.nextInt();
		
		int result=length*breath;
		
		return result;
		
	  }
	
     static double circle( float r) {
	double area=(double)Math.PI * r*r;
	
		return area;
		
	}
	
	
	
	
	

}
