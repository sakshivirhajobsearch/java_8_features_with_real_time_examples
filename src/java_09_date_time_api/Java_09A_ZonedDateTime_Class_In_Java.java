package java_09_date_time_api;

//java program to create a new
//ZonedDateTime using parse() method
import java.time.ZonedDateTime;

public class Java_09A_ZonedDateTime_Class_In_Java {

	public static void main(String[] args) {

		String text = "2011-10-02T14:45:30.123456789+05:30[Asia/Kolkata]";
		// creating a new ZonedDateTime object
		ZonedDateTime zone = ZonedDateTime.parse(text);
		System.out.println(zone);
	}
}