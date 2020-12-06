package ticketMechineExercise2Try;

import java.util.Scanner;

public class NotEnoughMoneyInt {

	static Scanner reader = new Scanner(System.in);

	public static int tryAgain(int stillNeedToPay) {
		System.out.println("Unfourtantly, it didnt enough..." + "\n" + "please add: "+stillNeedToPay);
		return reader.nextInt();
	}

}
