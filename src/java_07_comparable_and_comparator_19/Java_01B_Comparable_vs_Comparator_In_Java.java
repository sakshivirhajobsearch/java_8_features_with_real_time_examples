package java_07_comparable_and_comparator_19;

//Java program to demonstrate Comparator interface
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie {

	private String name;
	private double rating;
	private int year;

	// Constructor to initialize movie details
	public Movie(String name, double rating, int year) {

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

//Comparator to sort movies by rating
class Rating implements Comparator<Movie> {

	public int compare(Movie m1, Movie m2) {

		// Sort by rating in descending order
		return Double.compare(m2.getRating(), m1.getRating());
	}
}

//Comparator to sort movies by name
class NameCompare implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2) {

		// Sort by name in alphabetical order
		return m1.getName().compareTo(m2.getName());
	}
}

//Main class 
public class Java_01B_Comparable_vs_Comparator_In_Java {

	public static void main(String[] args) {

		// Create a list of movies
		ArrayList<Movie> m = new ArrayList<>();
		m.add(new Movie("Force Awakens", 8.3, 2015));
		m.add(new Movie("Star Wars", 8.7, 1977));
		m.add(new Movie("Empire Strikes Back", 8.8, 1980));

		// Sort movies by rating and display all
		Collections.sort(m, new Rating());
		System.out.println("Movies sorted by rating:");
		for (Movie m1 : m) {
			System.out.println(m1.getRating() + " " + m1.getName() + " " + m1.getYear());
		}

		// Sort movies by name and display all
		Collections.sort(m, new NameCompare());
		System.out.println("\nMovies sorted by name:");
		for (Movie m1 : m) {
			System.out.println(m1.getName() + " " + m1.getRating() + " " + m1.getYear());
		}
	}
}
