package ticketMechineExercise2Try.Customer;

import java.util.Scanner;

public class InsertRealMoney {

	static Scanner reader = new Scanner(System.in);

		public static int insertRealMoney() {
			System.out.println("Happy you choose real money!" + "\n" + "please insert it here: ");
				return reader.nextInt();
		}
}
