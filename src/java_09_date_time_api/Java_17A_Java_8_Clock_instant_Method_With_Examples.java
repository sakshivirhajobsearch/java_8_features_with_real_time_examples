package java_09_date_time_api;

//Java Program to demonstrate
//instant() method of Clock class
import java.time.Clock;
import java.time.Instant;

//create class
public class Java_17A_Java_8_Clock_instant_Method_With_Examples {

	// Main method
	public static void main(String[] args) {

		// create Clock Object
		Clock clock = Clock.systemDefaultZone();

		// get Instant Object of Clock
		// object using instant() method
		Instant instantObj = clock.instant();

		// print details of Instant Object
		System.out.println("Instant for class " + clock + " is " + instantObj);
	}
}