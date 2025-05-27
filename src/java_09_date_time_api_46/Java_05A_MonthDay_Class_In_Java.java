package java_09_date_time_api_46;

//Java Program to illustrate MonthDay Class

//Importing Month and MonthDay classes
//from java.time package
import java.time.Month;
import java.time.MonthDay;

public class Java_05A_MonthDay_Class_In_Java {

	public static void main(String[] args) {

		// Creating an object of MonthDay class by
		// storing instance of MonthDay by
		// passing date and month as arguments

		// Custom inputs are passed as arguments
		MonthDay monthday = MonthDay.of(Month.MARCH, 14);

		// Print and display the value stored
		System.out.println(monthday);
	}
}