package java_09_date_time_api_46;

//Java Program to Implement OffsetTime Class
//via getMinute() Method

//Importing the class from java.time package
import java.time.OffsetTime;

//Main class
public class Java_06C_OffsetTime_Class_In_Java {

	// Main driver method
	public static void main(String[] args) {

		// Creating an instance of the class
		OffsetTime offset = OffsetTime.now();

		// Getting the minutes of the day field
		int m = offset.getMinute();

		// Print and display the minutes
		System.out.println(m + " minutes");
	}
}