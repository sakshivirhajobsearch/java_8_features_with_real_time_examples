package java_09_date_time_api_46;

//Java Program to illustrate LocalDateTime Class of java.time package  

//Importing LocalDateTime class from java.time package
import java.time.LocalDateTime;

//Main class for LocalDateTime
public class Java_04A_LocalDateTime_Class_In_Java {

	// Main driver method
	public static void main(String[] args) {

		// Creating an object of LocalDateTime class
		// in the main() method
		LocalDateTime now = LocalDateTime.now();

		// Print statement
		System.out.println(now);

		// Adding 1 year, 1 month, 1 week and 1 day
		LocalDateTime localDateTime1 = now.plusYears(1).plusMonths(1).plusWeeks(1).plusDays(1);
		// Print statement
		System.out.println(localDateTime1);

		// Subtracting 1 year, 1 month, 1 week and 1 day
		LocalDateTime localDateTime2 = localDateTime1.minusYears(1).minusMonths(1).minusWeeks(1).minusDays(1);
		// Print statement
		System.out.println(localDateTime2);

		// Adding 1 hour, 1 minute, 1 second and 100
		// nanoseconds
		LocalDateTime localDateTime3 = localDateTime2.plusHours(1).plusMinutes(1).plusSeconds(1).plusNanos(100);
		// Print statement
		System.out.println(localDateTime3);

		// Subtracting 1 hour, 1 minute, 1 second and 100
		// nanoseconds
		LocalDateTime localDateTime4 = localDateTime3.minusHours(1).minusMinutes(1).minusSeconds(1).minusNanos(100);
		// Print statement
		System.out.println(localDateTime4);
	}
}