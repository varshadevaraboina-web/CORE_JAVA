package com.javaintro;

public class Factorial {
	
	void main() {
		int num=6;
		int factorial=1;
		
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
			
		}
		
		System.out.println("The Factorial of 6 is:"+" "+factorial);
		
	}
	
	public static void main(String[] args) {
		Factorial f=new Factorial();
		f.main();

	}

}
