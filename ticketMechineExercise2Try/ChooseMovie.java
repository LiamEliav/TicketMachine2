package ticketMechineExercise2Try;

import java.util.ArrayList;
import java.util.Scanner;

public class ChooseMovie {

	static Scanner reader = new Scanner(System.in);

	public static String chooseMovie(ArrayList<String> movies, String movieName) {

		for (int i = 0; i < movies.size(); i++) {
			if (movies.contains(movieName)) {
				System.out.println(movieName + " is great, you gonna love it!");
				return movieName;
			}
		}
		System.out.println(movieName + " Wasn't found, please try again!");
		return chooseMovie(movies, reader.next());
	}

}
