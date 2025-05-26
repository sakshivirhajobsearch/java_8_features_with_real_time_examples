package java_09_date_time_api;

//java.time.ZoneId Class in Java with example
import java.time.LocalTime;
import java.time.ZoneId;

public class Java_10A_ZoneId_Class_In_Java {

	public static void main(String[] args) {

		// Setting Zone1
		ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");
		// Setting Zone2
		ZoneId zoneid2 = ZoneId.of("Europe/London");
		LocalTime time1 = LocalTime.now(zoneid1);
		LocalTime time2 = LocalTime.now(zoneid2);
		System.out.println(time1);
		System.out.println(time2);

		// Checking if the time of zone1
		// comes before time of second zone
		System.out.println(time1.isBefore(time2));
	}
}