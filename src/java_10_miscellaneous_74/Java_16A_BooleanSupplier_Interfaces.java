package java_10_miscellaneous_74;

//Java program to illustrate
//getAsBoolean() method of
//BooleanSupplier Interface

import java.util.function.BooleanSupplier;

public class Java_16A_BooleanSupplier_Interfaces {

	public static void main(String args[]) {

		// Create a BooleanSupplier instance
		BooleanSupplier sup = () -> true;

		// Get the boolean value
		// Using getAsBoolean() method
		System.out.println(sup.getAsBoolean());
	}
}
