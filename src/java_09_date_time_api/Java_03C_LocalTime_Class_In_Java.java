package java_09_date_time_api;

//Java Program to illustrate LocalTime
//where plusMethod() is illustrated

//Importing LocalTime class from
//java.time package 
import java.time.LocalTime;

//Main Class
public class Java_03C_LocalTime_Class_In_Java {

// Main class
	public static void main(String args[]) {

		// Creating an object of LocalTime class by
		// declare a variable to store LocalTime
		LocalTime ltime = LocalTime.now();

		// plusHours() method will add up Hours to
		// the LocalTime
		LocalTime time3 = ltime.plusHours(05);

		// Display the time
		System.out.println(time3);
	}
}
