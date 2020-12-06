package ticketMechineExercise2Try;

import java.util.Scanner;

public class Cinema {
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Hello, please press 1 for Customer or 2 for Developer");
		whichMachine(reader.nextInt());
		
		
	}

	public static void whichMachine(int machineType) {
		String[] args = new String[] { "" };

		switch(machineType)
		{
		case 1:
			CinemaForCustomer.main(args); // Call the main() method of CinemaForCustomer
			break;
		case 2:
			CinemaForDeveloper.main(args);// Call the main() method of CinemaForDeveloper
			break;	
		default:	
			System.out.println("You enterd wrong num please try again");
			whichMachine(reader.nextInt());	
			break;
		}
	}
}
