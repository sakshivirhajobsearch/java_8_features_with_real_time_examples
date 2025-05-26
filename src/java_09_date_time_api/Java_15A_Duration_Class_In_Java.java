package java_09_date_time_api;

//Importing required classes
import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Java_15A_Duration_Class_In_Java {

	public static void main(String[] args) {

		// Initializing Duration variable
		Duration duration = Duration.between(LocalTime.NOON, LocalTime.MIDNIGHT);

		// Printing difference between time in seconds
		System.out.println(duration.get(ChronoUnit.SECONDS));

		// Finding absolute difference
		Duration absDuration = duration.abs();

		// Printing absolute time difference in seconds
		System.out.println(absDuration.get(ChronoUnit.SECONDS));
	}
}