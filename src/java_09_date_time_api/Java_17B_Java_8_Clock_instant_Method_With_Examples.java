package java_09_date_time_api;

//Java Program to demonstrate
//instant() method of Clock class
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//create class
public class Java_17B_Java_8_Clock_instant_Method_With_Examples {

	// Main method
	public static void main(String[] args) {

		// create a Zone Id for Europe/Paris
		ZoneId zoneId = ZoneId.of("Europe/Paris");

		// create Clock Object by passing zoneID
		Clock clock = Clock.system(zoneId);

		// get Instant Object of Clock
		// object using instant() method
		Instant instantObj = clock.instant();

		// get ZonedDateTime object from
		// instantObj to get zoned date time
		ZonedDateTime time = instantObj.atZone(clock.getZone());

		// print details of Instant Object
		System.out.println("Instant for class " + clock + " is " + time.toString());
	}
}