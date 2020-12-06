package ticketMechineExercise2Try;

import java.util.ArrayList;

public class TicketMachineForCustomer extends TicketMachine {

	Moovie movie;
	private String customerName;
	RealMoneyPay moneyToPay;

	public TicketMachineForCustomer(String customerName) {
		super();
		this.customerName = customerName;
		this.movie= new Moovie();
	}
	
	public void chooseMovie(String movieName) {
		this.movie.setName(ChooseMovie.chooseMovie(movies, movieName));
	}

	public void printMovies() {
		for (String movieName : movies)
			System.out.println(movieName);
	}

	public void chooseDay() {
		this.movie.setCurrentMovieDay(this.movie.day.goOverDays());
	}

	
	public void chooseHour() {
		this.movie.setCurrentMovieHour(this.movie.hour.goOverHours());
	}
	

	public void payCreditOrReal(String money) {
		if (money.equals("0"))
			payReal();
		else
			CreditCardPay.payInCreditCard(money, this.movie.getPrice());

		printTicket();
	}

	public void payReal() {
		RealMoneyPay.payWithActualMoney(InsertRealMoney.insertRealMoney(), this.movie.getPrice());
	}

	public void printTicket() {
		PrintTicket.printTicket(this.customerName, movie.ticketString());
	}

	public String getCustomerName() {
		return customerName;
	}
}
