package ticketMechineExercise2Try;

import java.util.Scanner;

public class RealMoneyPay {

	static Scanner reader = new Scanner(System.in);
    
	public static void payWithActualMoney(int money, int moviePrice) {
		if (moviePrice <= money)
			System.out.println("Payment accepted in actual money, her's your change " + (money - moviePrice));
		else {
			//System.out.println("Payment didn't work please try again!");
			     payWithActualMoney(NotEnoughMoneyInt.tryAgain(moviePrice-money),moviePrice-money);
		}
	}
}