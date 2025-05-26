package java_09_date_time_api_46;

//minus() method implementation
import java.time.Period;
import java.time.YearMonth;

public class Java_13B_YearMonth_Class_In_Java {

	public static void main(String[] args) {
		YearMonth obj1 = YearMonth.now();

		// .minus(Period.ofYears(int)) will subtract
		// no. ofyears from the existing year
		YearMonth obj2 = obj1.minus(Period.ofYears(3));
		System.out.println(obj2);
	}
}