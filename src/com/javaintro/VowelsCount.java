package com.javaintro;

public class VowelsCount {
	public static void main(String[] args) {

		String str = "varsha";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				count++;
			}
		}

		System.out.println(str);
		System.out.println("Vowels = " + count);
	}
}