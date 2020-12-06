package ticketMechineExercise2Try.Customer;

public class CreditCardPay {
	
	
	//private static boolean isTransferd=false;
	
	public static void payInCreditCard (String creditCardNum, int moviePrice) {

			if (creditCardNum.matches("[0-9]+") && creditCardNum.length() == 12) 
				System.out.println("Payment accepted in credit card");
		   else
				payInCreditCard(TryAgainString.tryAgain(), moviePrice);
		}
	}


