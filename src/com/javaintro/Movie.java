package com.javaintro;

public class Movie {
	
	//static variables
	static String ThreaterName="Krishna";
	static String ThreaterLocation="Hyd";
	
	//instance variables
	String MovieName;
	double MovieBudget;
	String ReleaseDate;
	
	public static void main(String[] args) {
		
		Movie m1=new Movie();
		m1.MovieName="RRR";
		m1.MovieBudget=300.5;
		m1.ReleaseDate="28-08-2026";
		
		System.out.println("ThreaterName:"+ " "+ThreaterName);
		System.out.println("ThreaterLocation:"+ " "+ThreaterLocation);
		System.out.println("Movies List");
		System.out.println("");
		
		System.out.println("MovieName:"+" "+ m1.MovieName); 
		System.out.println("MovieBudget:" + " "+ m1.MovieBudget);
		System.out.println("ReleaseDate:"+ " "+ m1.ReleaseDate);
		System.out.println("");
		
		Movie m2=new Movie();
		m2.MovieName="Bahubali";
		m2.MovieBudget=503.5;
		m2.ReleaseDate="30-08-2026";
		
		System.out.println("MovieName:"+" "+ m2.MovieName); 
		System.out.println("MovieBudget:" + " "+ m2.MovieBudget);
		System.out.println("ReleaseDate:"+ " "+ m2.ReleaseDate);
		System.out.println("");
		

		Movie m3=new Movie();
		m3.MovieName="Devara";
		m3.MovieBudget=103.5;
		m3.ReleaseDate="03-09-2026";
		
        System.out.println("MovieName:"+" "+ m3.MovieName); 
		System.out.println("MovieBudget:" + " "+ m3.MovieBudget);
		System.out.println("ReleaseDate:"+ " "+ m3.ReleaseDate);
		System.out.println("");

		Movie m4=new Movie();
		m4.MovieName="pushpa";
		m4.MovieBudget=293.5;
		m4.ReleaseDate="15-09-2026";
		
		System.out.println("MovieName:"+" "+ m4.MovieName); 
		System.out.println("MovieBudget:" + " "+ m4.MovieBudget);
		System.out.println("ReleaseDate:"+ " "+ m4.ReleaseDate);
		System.out.println("");

		Movie m5=new Movie();
		m5.MovieName="salaar";
		m5.MovieBudget=113.5;
		m5.ReleaseDate="22-10-2026";
		
		System.out.println("MovieName:"+" "+ m5.MovieName); 
		System.out.println("MovieBudget:" + " "+ m5.MovieBudget);
		System.out.println("ReleaseDate:"+ " "+ m5.ReleaseDate);
	}

}
