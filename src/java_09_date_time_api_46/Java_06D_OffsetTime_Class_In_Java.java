package java_09_date_time_api_46;

//Java Program to Implement OffsetTime Class
//via getSecond() Method

//Importing the class from java.time package
import java.time.OffsetTime;

public class Java_06D_OffsetTime_Class_In_Java {

	public static void main(String[] args) {

		// Creating an instance of the class
		OffsetTime offset = OffsetTime.now();

		// Getting the second from the day field
		int s = offset.getSecond();

		// Print and display the seconds
		System.out.println(s + " seconds");
	}
}
