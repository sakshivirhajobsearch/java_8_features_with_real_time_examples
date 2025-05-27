package java_09_date_time_api_46;

//Java Program to illustrate LocalTime Class

//Importing LocalDateTime class from 
//java.time package 
import java.time.LocalTime;

public class Java_03A_LocalTime_Class_In_Java {

	public static void main(String args[]) {

		// Creating an object of LocalTime class by
		// declaring a variable to store LocalTime
		LocalTime ltime = LocalTime.now();

		// Print and display the LocalTime value
		System.out.println("Local time value : " + ltime);
	}
}
