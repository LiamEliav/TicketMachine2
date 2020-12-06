package ticketMechineExercise2Try;

import java.util.ArrayList;
import java.util.Scanner;

public class EraseMovies {
	static Scanner reader = new Scanner(System.in);

	public static ArrayList<String> eraseMovies(ArrayList<String> movies) {
		System.out.println("Please enter Movie name");
		if (!(movies.remove(new String(reader.next()))))
			eraseMovies(movies);
		return movies;

	}

}
