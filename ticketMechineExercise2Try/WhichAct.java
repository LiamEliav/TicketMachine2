package ticketMechineExercise2Try;

import java.util.Scanner;

public class WhichAct {
	
	static Scanner reader = new Scanner(System.in);

	public static int whichAct() {
		
		 System.out.println("click 1 for changing movies in stack, 2 for set Hours or 3 changing Days  ");
		      int n = reader.nextInt();
		if  (n!=1&&n!=2&&n!=3)
		{
			System.out.println("Try again");
			whichAct();
	   	}
	
	return n;	
	}
	 
}
