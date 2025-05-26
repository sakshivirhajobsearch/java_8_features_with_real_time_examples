package java_09_date_time_api;

//import java.time.OffsetDateTime class
import java.time.OffsetDateTime;

public class Java_07B_OffsetDateTime_Class_In_Java {

	public static void main(String[] args) {

		// now() is a method used to obtain current
		// date and time from the system clock.
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		// Display the offsetDateTime which will
		// display all current date and time.
		System.out.println(offsetDateTime);
		// Display the Hour,Minute, Second and
		// Nanosecond using getHour(), getMinute(),
		// getSecond() and getNano()
		System.out.println("Hour  : " + offsetDateTime.getHour() + " Minute : " + offsetDateTime.getMinute()
				+ " Second : " + offsetDateTime.getSecond() + " NanoSecond : " + offsetDateTime.getNano());
	}
}