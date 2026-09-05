package com.javaintro;

public class String_Reverse {

	public static void main(String[] args) {
		String name="varsha";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			}
		System.out.println("The String is:" + name +".");
		System.out.println("The reverse String is:" + rev +".");
	}

}
