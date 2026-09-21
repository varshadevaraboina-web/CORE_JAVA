package com.javaintro;

public class Test_Methods {
	
	
	//no return + no parameters
	static void addition() {
		int a=3;
		int b=8;
		int sum=a+b;
		System.out.println("Sum of two numners are:" +" "+ sum);
		
		}
	
	//no return + with parameters
	static void subtraction(int a,int b){
		int sub=a-b;
		System.out.println("Difference of two numbers are:" +" "+ sub);
		
	} 
	
	// return + no parameters
	static String name(String name) {
		return name;
	
		}
	
	// return + with parameters
	static int add(float a,float b) {
		return (int) (a+b);
		
		}
	
	public static void main(String[] args) {
		
      addition();
      subtraction(30,20);
      String result=name("varsha");
      System.out.println("My name is:" +" "+ result);
      float sum= add(3.8f,2.8f);
      System.out.println("Sum of float value is:" +" "+ sum);
      
	}

}
