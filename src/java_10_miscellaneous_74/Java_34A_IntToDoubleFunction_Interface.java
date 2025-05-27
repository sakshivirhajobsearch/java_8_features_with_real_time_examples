package java_10_miscellaneous_74;

//Java Program to demonstrate
//IntToDoubleFunction's applyAsDouble() method

import java.util.function.IntToDoubleFunction;

public class Java_34A_IntToDoubleFunction_Interface {

	public static void main(String args[]) {

		// Declare IntToDoubleFunction
		IntToDoubleFunction func = a -> 3.12 * a;

		// Apply the function to get the result as double
		// using applyAsDouble()
		System.out.println(func.applyAsDouble(2));
	}
}
