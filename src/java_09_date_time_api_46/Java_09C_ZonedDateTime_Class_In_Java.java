package java_09_date_time_api_46;

//java program to illustrate working
//of plus() and minus() method
import java.time.Period;
import java.time.ZonedDateTime;

public class Java_09C_ZonedDateTime_Class_In_Java {

	public static void main(String[] args) {

		String text = "2011-10-02T14:45:30.123456789+05:30[Asia/Kolkata]";

		// Creating a new ZonedDateTime object
		ZonedDateTime zone = ZonedDateTime.parse(text);

		// printing original value of
		// this ZonedDateTime object
		System.out.println(zone);
		// printing value of this ZonedDateTime
		// object after subtracting two months
		System.out.println(zone.minus(Period.ofMonths(2)));
		// printing value of this ZonedDateTime
		// object after adding two months
		System.out.println(zone.plus(Period.ofMonths(2)));
	}
}
