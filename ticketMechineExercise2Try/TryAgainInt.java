package ticketMechineExercise2Try;

import java.util.Scanner;

public class TryAgainInt {
	
	static Scanner reader = new Scanner(System.in);

		public static int tryAgain() {
			System.out.println("You entered wrong num..." + "\n" + "please try agian: ");
			return reader.nextInt();
		}
}
