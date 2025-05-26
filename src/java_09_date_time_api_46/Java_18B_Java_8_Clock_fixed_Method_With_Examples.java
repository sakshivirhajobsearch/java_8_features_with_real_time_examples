package java_09_date_time_api_46;

//Java program to demonstrate 

//fixed() method of Clock class
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

//create class
public class Java_18B_Java_8_Clock_fixed_Method_With_Examples {

	// Main method
	public static void main(String[] args) {

		// create instance of clock class
		Instant instant = Instant.now();

		// create ZoneId for defaultZone which is UTC
		ZoneId zoneId = ZoneId.systemDefault();

		// call fixed method
		Clock clock = Clock.fixed(instant, zoneId);

		// print details of clock
		System.out.println(clock.toString());
	}
}
