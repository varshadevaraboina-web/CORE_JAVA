package com.javaintro;

public class Constructors {
	String movieName;
	String theaterLocation;
	int ticketCost;

	static{
		 System.out.println("🎬 Welcome to Movie Booking System!");
		    System.out.println("=================================");

	}

	Constructors() {
	    System.out.println("A new movie booking object is created.");
	    
	}

	Constructors(String movieName,String theaterLocation,int ticketCost){
		
		this.movieName=movieName;
		this.theaterLocation=theaterLocation;		
		this.ticketCost=ticketCost;
		System.out.println("Movie booking details initialized successfully!");
		System.out.println();
	}

	public static void main(String[] args) {

	    System.out.println("----- Creating First Object -----");

	    Constructors c = new Constructors();

	    System.out.println();

	    System.out.println("----- Creating Second Object -----");

	    Constructors c1 = new Constructors("Paradise", "Hyderabad", 250);

	    System.out.println();
	    System.out.println("----- Movie Details -----");

	    System.out.println("Movie Name      : " + c1.movieName);
	    System.out.println("Theater Location: " + c1.theaterLocation);
	    System.out.println("Ticket Cost     : ₹" + c1.ticketCost);
	}
}