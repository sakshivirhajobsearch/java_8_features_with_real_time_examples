package java_01_lambda_expressions_34;

//Interface
@FunctionalInterface
interface Cab {
	void bookCab();
}

public class Java_08B_Match_Lambdas_To_Interfaces_In_Java {

	// Method 1
	public static void main(String[] args) {

		// Creating object of above functional interface
		Cab cab = new Cab() {
			// Method 2
			// Overriding above bookCab() method
			@Override
			public void bookCab() {

				// Print statement
				System.out.println("Booking Successful!! Arriving Soon!!");
			}
		};
		cab.bookCab();
	}
}
