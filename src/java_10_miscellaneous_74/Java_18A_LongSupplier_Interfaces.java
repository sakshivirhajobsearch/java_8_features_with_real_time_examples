package java_10_miscellaneous_74;

//Java program to illustrate
//getAsLong() method

import java.util.function.LongSupplier;

public class Java_18A_LongSupplier_Interfaces {

	public static void main(String args[]) {

		// Create a LongSupplier instance
		LongSupplier sup = () -> (int) (Math.random() * 10);

		// Get the long value
		// Using getAsLong() method
		System.out.println(sup.getAsLong());
	}
}
