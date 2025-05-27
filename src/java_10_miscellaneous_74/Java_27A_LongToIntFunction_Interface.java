package java_10_miscellaneous_74;

//Java Program to demonstrate
//LongToIntFunction's applyAsInt() method

import java.util.function.LongToIntFunction;

public class Java_27A_LongToIntFunction_Interface {

	public static void main(String args[]) {

		// Instantiating LongToIntFunction
		LongToIntFunction ob = a -> (int) a * 100000;

		// Applying the above function
		// using applyAsInt()
		System.out.println(ob.applyAsInt(2));
	}
}
