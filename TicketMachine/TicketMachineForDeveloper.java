package ticketMechineExercise2Try;

public class TicketMachineForDeveloper extends TicketMachine {

	private Moovie movie;

	public TicketMachineForDeveloper() {
		this.movie = new Moovie();

	}

	public void defineAct() {
		int n = WhichAct.whichAct();

		if (n == 1)
			changeMovies();
		if (n == 2)
			changeHours();
		if (n == 3)
			changeDays();
		isContinue();
	}

	public void changeMovies() {
		if (AddOrErase.addOrErase() == 1)
			eraseMovies();
		else
			addMovies();
	}

	public void eraseMovies() {
		printMovies();
		this.movies = EraseMovies.eraseMovies(this.movies);
		printMovies();
	}

	public void addMovies() {
		printMovies();
		this.movies = AddMovies.addMovies(this.movies);
		printMovies();
	}

	public void changeHours() {

		if (AddOrErase.addOrErase() == 1)
			eraseHours();
		else
			addHours();
	}

	public void eraseHours() {
		this.movie.hour.printHours();
		this.movie.hour.eraseHours();
		this.movie.hour.printHours();
	}

	public void addHours() {
		this.movie.hour.printHours();
		this.movie.hour.addHours();
		this.movie.hour.printHours();
	}

	public void changeDays() {

		if (AddOrErase.addOrErase() == 1)
			eraseDays();
		else
			addDays();
	}

	public void eraseDays() {
		this.movie.day.printDays();
		this.movie.day.eraseDays();
		this.movie.day.printDays();
	}

	public void addDays() {
		this.movie.day.printDays();
		this.movie.day.addDays();
		this.movie.day.printDays();

	}

	public void printMovies() {
		for (String movieName : this.movies)
			System.out.println(movieName);
	}

	public void isContinue() {
		if (IsContinue.isContinue() == 1)
			defineAct();
		else
			System.out.println("Thats all for today, thankYou!");
	}

}
