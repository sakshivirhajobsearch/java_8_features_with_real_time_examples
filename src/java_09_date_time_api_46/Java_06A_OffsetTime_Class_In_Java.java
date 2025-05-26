package java_09_date_time_api_46;

//Java Program to Implement OffsetTime class
//via now() method

//Importing required classes
import java.time.OffsetTime;
import java.time.temporal.ChronoField;

//Main class
public class Java_06A_OffsetTime_Class_In_Java {

	// Main driver method
	public static void main(String[] args) {

		// Creating an object of class in main() method
		OffsetTime offset = OffsetTime.now();

		int h = offset.get(ChronoField.HOUR_OF_DAY);
		System.out.println(h);

		int m = offset.get(ChronoField.MINUTE_OF_DAY);
		System.out.println(m);

		int s = offset.get(ChronoField.SECOND_OF_DAY);
		System.out.println(s);
	}
}
