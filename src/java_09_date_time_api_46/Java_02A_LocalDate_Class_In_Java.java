package java_09_date_time_api_46;

//import package used to work with current date and time
//api.
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Java_02A_LocalDate_Class_In_Java {

	public static void main(String[] args) {

		// now() is a method to return the
		// instance of LocalDateTime class.
		LocalDateTime localDate = LocalDateTime.now();
		// DateTimeFormatter class used to format and
		// parse date and time. ofPattern() is a method
		// used with DateTimeFormatter to format and
		// parse date and time.
		DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("MM dd, YYYY");
		// display the date
		System.out.println(dateformatter.format(localDate));
	}
}
