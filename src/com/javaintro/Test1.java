package com.javaintro;

//In java , before main method , jvm checks is there any static block and load the static blocks first before main method
//Then without main method can we execute static block..?
//yes before 1.5 version !!
//No from 1.5 version !!

//First ,it checks whether main method is there or not ..?
//Next, checks the static block and then loading with the help prepare from linking.

public class Test1 {
	
	static int a;
	int b;
	
	//main method: entry point of any java program
     public static void main(String[] args) {
		System.out.println("main method started !!");
		
		System.out.println(a);	
		System.out.println("main method ended !!");

	}
     
     //static block
     static {   
    	 System.out.println("static block called");
    	 System.out.println("welcome to JVM Architecture");
    	 System.out.println(a);
    	 
     }

}
