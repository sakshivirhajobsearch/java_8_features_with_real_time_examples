package java_09_date_time_api_46;

//Java Program to illustrate MonthDay Class

//importing MonthDay class from java.time
import java.time.MonthDay;

//Main Class
public class Java_05B_MonthDay_Class_In_Java {

	// Main driver method
	public static void main(String[] args) {

		// Store an instance of MonthDay
		// from a text i.e --03-14
		MonthDay monthday = MonthDay.parse("--03-14");

		// Display the month using instance of class
		System.out.println(monthday.getMonth());
	}
}
