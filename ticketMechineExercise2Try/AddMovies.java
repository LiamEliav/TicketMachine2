package ticketMechineExercise2Try;

import java.util.ArrayList;
import java.util.Scanner;

public class AddMovies {

	static Scanner reader = new Scanner(System.in);
	
	public static ArrayList<String> addMovies(ArrayList<String> movies) {
		System.out.println("Please enter Movie name: ");
		if (!(movies.add(new String(reader.next()))))
			addMovies(movies);
		return movies;
	}
	
}
