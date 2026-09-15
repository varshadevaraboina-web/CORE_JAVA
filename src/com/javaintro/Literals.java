package com.javaintro;

public class Literals {
	
	public static void main(String[] args) {
		System.out.println("Integral Literals:");
		System.out.println("------------------");
		
		//Decimal Literls : Base is 10 : 0 to 9
		int i1=134;
		int i2=2334; 
		System.out.println(i1);
		System.out.println(i2);
		
		//Whenever starts with 0 is consider as octal
		//octal Literals : Base is 8 : 0 to 7
		//0+ 2*8^2 +3*8^1 +4*8^0
		int o=0234;
		int o1=0276;
		System.out.println(o);
		System.out.println(o1);
		
		//Whenever starts with 0x is consider as Hexa - Decimal
		//Hexa - Decimal : Base is 16 : 0 to 9 a-f or A-F 
		int h=0x456;
		int h1=0xb34;
		int h2=0xbf34;
		System.out.println(h);
		System.out.println(h1);
		System.out.println(h2);
		
		//Number written using the binary number (0,1)
		//Base is 2 :      0*2^4 + 1*2^3 + 1*2^2 + 0*2^1 + 1*2^0
		int b=01101;
		System.out.println(b);
		
		}

}
