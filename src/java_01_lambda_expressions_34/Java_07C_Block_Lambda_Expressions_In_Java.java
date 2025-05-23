package java_01_lambda_expressions_34;

//Interface
//Functional interface named 'New'
interface New {

	// Boolean function to check over
	// natural number depicting calendar year

	// 'n' deepicting year is
	// passed as an parameter
	boolean test(int n);
}

//Class
public class Java_07C_Block_Lambda_Expressions_In_Java {

	// Main driver method
	public static void main(String[] args) {

		// block lambda
		// This block lambda checks if the
		// given year is leap year or not
		New leapyr = (year) -> {

			// Condition check
			// If year is divisible by 400 or the
			// year is divisible by 4 and 100 both
			if (((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)))

				// Returning true as year is leap year
				return true;
			else

				// Returning false for non-leap years
				return false;
		};

		// Calling lambda function over
		// custom input year- 2020

		// Condition check using the test()
		// defined in the above interface
		if (leapyr.test(2020))

			// Display message on the console
			System.out.println("leap year");
		else

			// Display message on the console
			System.out.println("Non leap year");
	}
}
