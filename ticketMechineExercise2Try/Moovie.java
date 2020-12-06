package ticketMechineExercise2Try;

public class Moovie {

	private String name;
	private int price;
	protected Day day;
	protected Hour hour;
	private String currentMovieDay;
	private String currentMovieHour;

	public Moovie() {
		this.name = "";
		this.price = 39;
		this.day = new Day();
		this.hour = new Hour();
		this.currentMovieDay = "";
		this.currentMovieHour = "";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCurrentMovieSelected(String movieName) {
		this.name = movieName;
	}

	public String ticketString() {
		return "Movie Name: " + name + "\n" + "Price: " + this.price + "\n" + "On: " + this.currentMovieDay + "\n" + "At: "
				+ this.currentMovieHour;

	}

	public String getCurrentMovieDay() {
		return currentMovieDay;
	}

	public void setCurrentMovieDay(String currentMovieDay) {
		this.currentMovieDay = currentMovieDay;
	}

	public String getCurrentMovieHour() {
		return currentMovieHour;
	}

	public void setCurrentMovieHour(String currentMovieHour) {
		this.currentMovieHour = currentMovieHour;
	}

	public int getPrice() {
		return price;
	}
	
	


	
}
