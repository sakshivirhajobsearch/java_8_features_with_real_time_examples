package java_10_miscellaneous_74;

//Java Program to demonstrate
//DoubleToIntFunction's applyAsInt() method

import java.util.function.DoubleToIntFunction;

public class Java_36A_DoubleToIntFunction_Interface {

	public static void main(String args[]) {

		// Create a DoubleToIntFunction
		DoubleToIntFunction truncate = a -> (int) a;

		// Apply the function using applyAsInt()
		System.out.println(truncate.applyAsInt(10.6));
	}
}
