package java_09_date_time_api_46;

//Java Program to Implement OffsetTime Class
//via getHour() method

//Importing the class from java.time package
import java.time.OffsetTime;

//Main class
public class Java_06B_OffsetTime_Class_In_Java {

	// Main driver method
	public static void main(String[] args) {

		// Creating an instance of class and
		// operation now() method over it to
		// get the current time from clock
		OffsetTime offset = OffsetTime.now();

		// Getting the hour of day field
		int h = offset.getHour();

		// Print and display the hours
		System.out.println(h + " hours");
	}
}