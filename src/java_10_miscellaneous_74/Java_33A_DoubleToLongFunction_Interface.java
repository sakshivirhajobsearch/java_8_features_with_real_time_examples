package java_10_miscellaneous_74;

//Java Program to demonstrate
//DoubleToLongFunction's applyAsLong() method

import java.util.function.DoubleToLongFunction;

public class Java_33A_DoubleToLongFunction_Interface {

	public static void main(String args[]) {

		// Declare the DoubleToLongFunction
		DoubleToLongFunction truncate = a -> (long) a;

		// Apply the function to get the result as long
		// using applyAsLong()
		System.out.println(truncate.applyAsLong(10.6));
	}
}
