package com.javaintro;

class student {
	int sid;
	String name;
}
//class course{
//	int id;
//	String cname;
//	int fee;
//	
//	
//	}

public class FactoryMethod {

	public static student getStudent() {
		student s = new student();
		System.out.println(s);
		return s;
		}
	
//	public static course getCourse() {
//		course c=new course();
//		System.out.println(c);
//		return c;
//		
//		
//	}

	public static void main(String[] args) {
		
		student s=getStudent();
		s.sid=101;
		s.name="varsha";
		System.out.println("Student ID:"+" "+s.sid);
		System.out.println("Student Name:"+" "+s.name);
		
//		course c=getCourse();
//		c.id=103;
//		c.cname="JAVA";
//		c.fee=30000;
//		System.out.println("course id:"+" "+c.id);
//		System.out.println("course name:"+" "+c.cname);
//		System.out.println("Fee:"+" "+c.fee);
		
	}

}
