package com.javaintro;

public class Count_Object {
	static int count=0;
	//Static Block
	static {
		
		System.out.println("This is Static Block");
		}
	
	//Instance Block
	{
		System.out.println("This is Instance Block");	
		count++;
	}
	
      public static void main(String[] args) {
		Count_Object c1=new Count_Object();
		Count_Object c2=new Count_Object();
		Count_Object c3=new Count_Object();
        System.out.println("The number of objects are:" +" "+count);
		
		}

      }
