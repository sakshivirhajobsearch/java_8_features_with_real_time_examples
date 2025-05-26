package java_09_date_time_api_46;

//Importing required classes
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Java_15B_Duration_Class_In_Java {

	public static void main(String[] args) {

		// Getting duration in an hour
		Duration duration = Duration.from(ChronoUnit.HOURS.getDuration());

		// Printing duration in minutes
		System.out.println(duration.toMinutes());
	}
}