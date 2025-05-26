package java_09_date_time_api_46;

//java program to illustrate working of getZone() method
import java.time.ZonedDateTime;

public class Java_09B_ZonedDateTime_Class_In_Java {

	public static void main(String[] args) {

		String text = "2011-10-02T14:45:30.123456789+05:30[Asia/Kolkata]";

		// Creating a new ZonedDateTime object
		ZonedDateTime zone = ZonedDateTime.parse(text);

		// printing the zone of this zonedDateTime object
		System.out.println(zone.getZone());
	}
}