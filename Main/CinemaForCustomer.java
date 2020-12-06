package ticketMechineExercise2Try;

import java.util.Scanner;

public class CinemaForCustomer extends Cinema {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Hello there!" + "\n" + "What's your name?");
		TicketMachineForCustomer T = new TicketMachineForCustomer(reader.next());//create ticket machine with

		System.out.println("Welcome " + T.getCustomerName() + "\n"+ "\n" + "Which movie would you like to choose?"+ "\n");
		T.printMovies();//print all movies available

	    T.chooseMovie(reader.next()); // insure proper movie name entered
		
		T.chooseDay(); //user insert day 
		
		T.chooseHour(); //user insert hour 

		System.out.println("You need to pay: " + T.movie.getPrice() + "\n"
				+ "please insert money in credit card or press zero for actual money");
		T.payCreditOrReal(reader.next());//user enter credit card or real money
		
		

	}

}
