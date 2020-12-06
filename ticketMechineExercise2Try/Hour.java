package ticketMechineExercise2Try;

import java.util.ArrayList;
import java.util.Scanner;

public class Hour {

	static Scanner reader = new Scanner(System.in);

	private ArrayList<String> hours;

	public Hour() {
		this.hours = new ArrayList<String>();
		this.hours.add("15:00");
		this.hours.add("16:00");
		this.hours.add("17:00");
		this.hours.add("18:00");
		this.hours.add("18:30");
		this.hours.add("19:30");
		this.hours.add("20:00");

	}

	public void eraseHours() {
		System.out.println("Please enter hour to erase: ");
		if (!(hours.remove(new String(reader.next()))))
			eraseHours();

	}

	public void addHours() {
		System.out.println("Please enter hour to add: ");
		if (!(hours.add(new String(reader.next()))))
			addHours();
	}
	
	public void printHours() {
		for (String movieHours : hours)
			System.out.println(movieHours);
	}

	public String goOverHours() {
		printHours();
		System.out.println("\n" + "Please enter the hour you want: ");		
		String hour=reader.next();
		if (!(hours.contains(hour)))
		{
			System.out.println("This hour isn't available please try again");
			goOverHours();
		}
		    return hour;
	}
	

}
