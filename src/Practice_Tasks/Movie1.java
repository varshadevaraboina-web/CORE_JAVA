package Practice_Tasks;

import java.util.Scanner;

public class Movie1 {

	static Scanner sc = new Scanner(System.in);
	String theaterName;
	String movieName;
	double budget;
	int ticketCost;

	Movie1() {
		this("Krishna");

	}

	Movie1(String theaterName) {
		this(theaterName,"RRR");

	}

	Movie1(String theaterName,String movieName) {
		this(theaterName,movieName,5000000000.00);

	}

	Movie1(String theaterName,String movieName,double budget) {
		this(theaterName,movieName,budget,350);

	}
	
	

	Movie1(String theaterName, String movieName, double budget, int ticketCost) {
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
		
		Movie1 m=new Movie1("swarna");
	
		m.display();
	}
}