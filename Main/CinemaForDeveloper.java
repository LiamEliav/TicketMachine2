package ticketMechineExercise2Try;

import java.util.Scanner;

public class CinemaForDeveloper extends Cinema {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		
     System.out.println("Hello Devloper, How are you today");
     reader.next();
     System.out.println("great To Hear!!! ");
   
     TicketMachineForDeveloper ticketMachineForDeveloper=new TicketMachineForDeveloper();
     ticketMachineForDeveloper.defineAct();


	}

}
