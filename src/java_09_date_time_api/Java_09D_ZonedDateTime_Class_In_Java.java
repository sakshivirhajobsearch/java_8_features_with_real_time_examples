package java_09_date_time_api;

//Java program to illustrate working of of() method
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Java_09D_ZonedDateTime_Class_In_Java {

	public static void main(String[] args) {

		// getting current date
		LocalDate date = LocalDate.now();

		// getting current time
		LocalTime time = LocalTime.now();

		// getting system default zone id
		ZoneId zoneId = ZoneId.systemDefault();

		// creating a new ZonedDateTime object
		ZonedDateTime zonedatetime = ZonedDateTime.of(date, time, zoneId);
		System.out.println(zonedatetime);
	}
}
