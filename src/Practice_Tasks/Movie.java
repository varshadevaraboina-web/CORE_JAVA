package Practice_Tasks;

import java.util.Scanner;

public class Movie {

	static Scanner sc = new Scanner(System.in);
	String theaterName;
	String movieName;
	double budget;
	int ticketCost;

	Movie(String theaterName, String movieName, double budget, int ticketCost) {
		this.theaterName = theaterName;
		this.movieName = movieName;
		this.budget = budget;
		this.ticketCost = ticketCost;

	}

	void display() {

		System.out.println("Theater Name:" + " " + theaterName);
		System.out.println("Movie Name:" + " " + movieName);
		System.out.println("Budget:" + " " + budget);
		System.out.println("Ticlet Cost:" + " " + ticketCost);
	}

	public static void main(String[] args) {

//		Movie m=new Movie("Swarna kala","Bahubali",1000000000.00,350);
//		m.display();
		
		System.out.println("enter theater name");
		String theaterName = sc.next();
		System.out.println("enter movie name");
		String movieName = sc.next();
		System.out.println("enter budget ");
		double budget = sc.nextDouble();
		System.out.println("enter ticket cost");
		int ticketCost = sc.nextInt();

		Movie m = new Movie(theaterName,movieName,budget,ticketCost);
		m.display();

	}

}
