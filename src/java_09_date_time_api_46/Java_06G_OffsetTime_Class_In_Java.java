package java_09_date_time_api_46;

//Java Program to Implement OffsetTime Class
//via toLocalTime() Method

//Importing the class from java.time package
import java.time.OffsetTime;

public class Java_06G_OffsetTime_Class_In_Java {

	public static void main(String[] args) {

		// Getting the current time from the system clock
		// in the default time zone
		OffsetTime time = OffsetTime.now();

		// Getting the LocalTime part of this date-time
		System.out.println(time.toLocalTime());
	}
}