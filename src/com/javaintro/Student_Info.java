package com.javaintro;

public class Student_Info {
	 void display() {
		String name="varsha";
		int age=22;
		String college="CJITs";
		System.out.println("Student Details:");
		System.out.println("----------------");
		System.out.println("Name:"+" "+name);
		System.out.println("Age:"+" "+age);
		System.out.println("College:"+" "+college);
		}

	public static void main(String[] args) {
		
		Student_Info s=new Student_Info();
		s.display();
	}

}
