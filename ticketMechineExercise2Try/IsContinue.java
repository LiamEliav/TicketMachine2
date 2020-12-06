package ticketMechineExercise2Try;

import java.util.Scanner;

public class IsContinue {
	
	static Scanner reader = new Scanner(System.in);
	
	public static int isContinue()
	{
		System.out.println("press 1 for keep editing or 2 for finish");
		int n = reader.nextInt();
		if  (n!=1&&n!=2)
		{
			System.out.println("Try again");
			isContinue();
	   	}
	
	return n;	
		
	}

}
