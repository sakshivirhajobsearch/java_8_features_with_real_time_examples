package java_09_date_time_api_46;

import java.time.LocalDate;

public class Java_02B_LocalDate_Class_In_Java {

	public static void main(String[] args) {

		// Parses the date
		LocalDate dt1 = LocalDate.parse("2021-01-07");
		LocalDate result = dt1.withDayOfYear(01);

		// Prints the date with year
		System.out.println("The date with day of year is: " + result);
	}
}