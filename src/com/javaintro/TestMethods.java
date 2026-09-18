package com.javaintro;

public class TestMethods {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("");

		Name("varsha Devaraboina");
		ID("22681A0417");
		collegeName("CJITs");
		Location("Jangaon");
		collegeId(68);
		CGPA(7.49f);
		

		System.out.println("");
		System.out.println("Main method ended");

	}
	
	static void Name(String Name) {
		System.out.println("Name:" + Name);

	}
	
	static void ID(String ID) {
		System.out.println("ID:" + ID);

	}

	static void collegeName(String clgname) {
		System.out.println("collegeName:" + clgname);

	}
	
	static void Location(String Location) {
		System.out.println("Location:" + Location);

	}
	
	

	static void collegeId(int id) {
		System.out.println("collegeId:" + id);

	}

	static void CGPA(float marks) {
		System.out.println("CGPA:" + marks);

	}

}
