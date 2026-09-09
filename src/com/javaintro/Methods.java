package com.javaintro;

public class Methods {
	 static void task1() {
	System.out.println("calling static method1");
		}
	
      static void task2() {
    	  task1();
	 System.out.println("calling static method2");
		
	  }

    void task3() {
    	task2();
	System.out.println("calling instance method1");
	}

     void task4() {
    	 Methods m=new Methods();
    	 m.task3();
    	System.out.println("calling instance method2");
	
	}

	public static void main(String[] args) {
		Methods m=new Methods();
		m.task4();
		}

}
