package java_09_date_time_api;

//Java Program to illustrate LocalTime
//where plusMethod() is illustrated

//Importing LocalTime class from
//java.time package 
import java.time.LocalTime;

//Main Class 
public class Java_03B_LocalTime_Class_In_Java {

	// main driver method
	public static void main(String args[]) {

		// Creating an object of LocalTime Class by
		// declaring a variable to store LocalTime
		LocalTime ltime = LocalTime.now();

		// Now plusMinute() will add up minutes to the LocalTime
		LocalTime time3 = ltime.plusMinutes(120);

		// Display the time using object of class
		System.out.println("Time : " + time3);
	}
}