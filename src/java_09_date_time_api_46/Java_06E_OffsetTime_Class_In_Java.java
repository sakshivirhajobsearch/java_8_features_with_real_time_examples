package java_09_date_time_api_46;

//Java Program to Implement OffsetTime Class
//via getNano() Method

//Importing the class from java.time package
import java.time.OffsetTime;

public class Java_06E_OffsetTime_Class_In_Java {

	public static void main(String[] args) {

		// Creating an instance of the class
		// in the main() method
		OffsetTime offset = OffsetTime.now();

		// Getting the nano-of-second field
		int n = offset.getNano();

		// Print and display the nanoseconds
		System.out.println(n + " nanoseconds");
	}
}
