package java_07_comparable_and_comparator_19;

//Java program to demonstrate Comparator interface
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie1 {

	private String name;
	private double rating;
	private int year;

	// Constructor to initialize Movie1 details
	public Movie1(String name, double rating, int year) {

		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// Getter methods

}

//Comparator to sort Movie1s by rating
class Rating implements Comparator<Movie1> {

	public int compare(Movie1 m1, Movie1 m2) {

		// Sort by rating in descending order
		return Double.compare(m2.getRating(), m1.getRating());
	}
}

//Comparator to sort Movie1s by name
class NameCompare implements Comparator<Movie1> {
	public int compare(Movie1 m1, Movie1 m2) {

		// Sort by name in alphabetical order
		return m1.getName().compareTo(m2.getName());
	}
}

public class Java_01B_Comparable_vs_Comparator_In_Java {

	public static void main(String[] args) {

		// Create a list of Movie1s
		ArrayList<Movie1> m = new ArrayList<>();
		m.add(new Movie1("Force Awakens", 8.3, 2015));
		m.add(new Movie1("Star Wars", 8.7, 1977));
		m.add(new Movie1("Empire Strikes Back", 8.8, 1980));

		// Sort Movie1s by rating and display all
		Collections.sort(m, new Rating());
		System.out.println("Movie1s sorted by rating:");
		for (Movie1 m1 : m) {
			System.out.println(m1.getRating() + " " + m1.getName() + " " + m1.getYear());
		}

		// Sort Movie1s by name and display all
		Collections.sort(m, new NameCompare());
		System.out.println("\nMovie1s sorted by name:");
		for (Movie1 m1 : m) {
			System.out.println(m1.getName() + " " + m1.getRating() + " " + m1.getYear());
		}
	}
}
