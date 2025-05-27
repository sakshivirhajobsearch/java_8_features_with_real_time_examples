package java_10_miscellaneous_74;

import java.util.function.ToLongFunction;

public class Java_28A_ToLongFunction_Interface {

	public static void main(String args[]) {

		// Instantiating ToLongFunction
		ToLongFunction<Integer> ob = a -> a * 10000;

		// Applying the above function
		// using applyAsLong()
		System.out.println(ob.applyAsLong(3));
	}
}