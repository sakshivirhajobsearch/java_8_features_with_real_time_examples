package java_10_miscellaneous_74;

//Java Program to demonstrate
//IntToLongFunction's applyAsLong() method

import java.util.function.IntToLongFunction;

public class Java_35A_IntToLongFunction_Interface {

	public static void main(String args[]) {

		// Declare the IntToLongFunction
		IntToLongFunction func = a -> 1000000 * a;

		// Apply the function to get the result as long
		// using applyAsLong()
		System.out.println(func.applyAsLong(2));
	}
}
