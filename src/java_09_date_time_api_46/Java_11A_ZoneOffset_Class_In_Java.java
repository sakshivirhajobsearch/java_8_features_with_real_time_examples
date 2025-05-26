package java_09_date_time_api_46;

//Example of ofHoursMinutes() Method
import java.time.ZoneOffset;

public class Java_11A_ZoneOffset_Class_In_Java {

	public static void main(String[] args) {

		ZoneOffset zone = ZoneOffset.ofHoursMinutes(7, 15);
		System.out.println(zone);
	}
}