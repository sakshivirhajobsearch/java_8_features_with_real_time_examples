package java_09_date_time_api_46;

//Java Program to Implement OffsetTime Class
//via of() Method

//Importing desired classes from java.time package
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;

//Main class
public class Java_06F_OffsetTime_Class_In_Java {

	// Main driver method
	public static void main(String[] args) {

		// Obtaining an instance of OffsetTime
		// from a local time and an offset.
		OffsetTime time = OffsetTime.of(LocalTime.now(), ZoneOffset.UTC);

		// Print and display the time
		System.out.println(time);
	}
}
