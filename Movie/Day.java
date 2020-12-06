package ticketMechineExercise2Try;

import java.util.ArrayList;
import java.util.Scanner;

public class Day {

	static Scanner reader = new Scanner(System.in);

	private static ArrayList<String> days;

	public Day() {
		this.days = new ArrayList<String>();
		days.add("Sunday");
		this.days.add("Monday");
		this.days.add("Tuesday");
		this.days.add("Wednesday");
		this.days.add("Thursday");
		this.days.add("Friday");
		this.days.add("Saturday");

	}

	public void eraseDays() {
		System.out.println("Please enter day to erase: ");
		if (!(days.remove(new String(reader.next()))))
			eraseDays();
	}

	public void addDays() {
		System.out.println("Please enter day to add: ");
		if (!(days.add(new String(reader.next()))))
			addDays();
	}

	public void printDays() {
		for (String movieDays : days)
			System.out.println(movieDays);
	}

	public String goOverDays() {
		printDays();
		System.out.println("\n" + "Please enter the day you want: ");
		String day=reader.next();
		if (!(days.contains(day)))
		{
			System.out.println("This day isnt available please try again");
		    goOverDays();
		}
		    return day;
	}

}
