package java_09_date_time_api;

//Example of ofHoursMinutes() Method
import java.time.ZoneOffset;

public class Java_11A_ZoneOffset_Class_In_Java {

	public static void main(String[] args) {

		ZoneOffset zone = ZoneOffset.ofHoursMinutes(7, 15);
		System.out.println(zone);
	}
}