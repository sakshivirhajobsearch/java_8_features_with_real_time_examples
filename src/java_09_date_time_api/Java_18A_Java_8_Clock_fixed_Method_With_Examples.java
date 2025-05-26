package java_09_date_time_api;

//Java program to demonstrate
//fixed() method of Clock class
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

//create class
public class Java_18A_Java_8_Clock_fixed_Method_With_Examples {

	// Main method
	public static void main(String[] args) {

		// create instance of clock class
		Instant instant = Instant.parse("2018-08-19T16:02:42.00Z");

		// create ZoneId object for Asia/Calcutta zone
		ZoneId zoneId = ZoneId.of("Asia/Calcutta");

		// call fixed method
		Clock clock = Clock.fixed(instant, zoneId);

		// print details of clock
		System.out.println(clock.toString());
	}
}