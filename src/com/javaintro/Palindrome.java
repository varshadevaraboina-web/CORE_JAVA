package com.javaintro;

public class Palindrome {

	public static void main(String[] args) {
		String str="wow";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			}
		
		if(str.equals(rev))
		{
			System.out.println("The String is Palindrome:" +rev);
		}
		else {
			
			System.out.println("The String is not Palindrome:" +rev);
		}
		
		}
	
}