package com.javaintro;

public class student_1 {
	
	//statuc
	static String collegeName="vcube";
	
	
	//instance
		String studentName;
		int studentid;
		int studentMarks;
	
	
	public static void main(String[] args) {
		
		
		student_1 s=new student_1();
		
		s.studentName="varsha";
		s.studentid=101;
		s.studentMarks=85;
		
		
		System.out.println("collegeName : " + collegeName);
		System.out.println("studentName : " + s.studentName);
	    System.out.println("studentid : " + s.studentid);
		System.out.println("studentMarks : " + s.studentMarks);
		
		
		}

}
