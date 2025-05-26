package java_09_date_time_api;

//Java program to illustrate Period class
//demonstrate the methods of this class
//Methods like ofDays() and addTo()

//Importing all classes from java.time package
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

//Main class
public class Java_14B_Period_Class_In_Java {

	// Main driver method
	public static void main(String[] args) {

		// Getting a period representing number of days
		// using ofDays() method
		Period p = Period.ofDays(24);

		// Adding this period to the
		// temporal object i.e. temp
		Temporal temp = p.addTo(LocalDate.now());

		// Print and display on the console
		System.out.println(temp);
	}
}
