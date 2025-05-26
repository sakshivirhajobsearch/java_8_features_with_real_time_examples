package java_09_date_time_api_46;

//Java program to illustrate Period class
//demonstrate the methods of this class
//Methods - minus() and ofMonths()

//Importing Period class from
//java.time package
import java.time.Period;

//Main class
public class Java_14A_Period_Class_In_Java {

	// Main driver method
	public static void main(String[] args) {

		// Obtaining period representing number of months
		// using of months() method by
		// creating object of period class
		Period p1 = Period.ofMonths(6);

		// minus() will return a copy of this period
		// with the specified period subtracted.
		Period p2 = p1.minus(Period.ofMonths(2));

		// Print and display on the console
		System.out.println(p2);
	}
}