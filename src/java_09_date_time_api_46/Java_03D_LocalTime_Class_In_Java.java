package java_09_date_time_api_46;

//Java Program to illustrate LocalTime
//where plusMethod() is illustrated

//Importing LocalTime class from
//java.time package 
import java.time.LocalTime;

//Main Class
public class Java_03D_LocalTime_Class_In_Java {

	// Main driver method
	public static void main(String args[]) {

		// creating an object of. LocalTime Class by
		// declare a variable to store LocalTime
		LocalTime ltime = LocalTime.now();

		// minusMinute() will subtract minutes from
		// the LocalTime
		LocalTime time = ltime.minusMinutes(120);

		// Display the time
		System.out.println(time);
	}
}
