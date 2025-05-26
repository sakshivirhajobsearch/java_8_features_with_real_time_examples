package java_09_date_time_api;

//plus() Method implementation
import java.time.Period;
import java.time.YearMonth;

public class Java_13A_YearMonth_Class_In_Java {

	public static void main(String[] args) {
		YearMonth obj1 = YearMonth.now();

		// plus(Period.ofYears(int)) will add
		// no.of years to the existing year
		YearMonth obj2 = obj1.plus(Period.ofYears(0));
		System.out.println(obj2);
	}
}