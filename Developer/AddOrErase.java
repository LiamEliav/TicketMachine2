package ticketMechineExercise2Try;

import java.util.Scanner;

public class AddOrErase {
	
	static Scanner reader = new Scanner(System.in);

	public static int addOrErase() {
		
		System.out.println("I see you you want to make some changes" + "\n" + "please enter 1 for erase or 2 for add : ");
		int n = reader.nextInt();
		if  (n!=1&&n!=2)
		{
			System.out.println("Try again");
			addOrErase();
	   	}
	
	return n;	
	}

}
