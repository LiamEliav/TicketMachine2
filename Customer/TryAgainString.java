package ticketMechineExercise2Try.Customer;

import java.util.Scanner;

public class TryAgainString {

	static Scanner reader = new Scanner(System.in);

	public static String tryAgain() {
		System.out.println("Unfourtantly, it didnt work..." + "\n" + "please try agian: ");
		return reader.next();
	}

}
