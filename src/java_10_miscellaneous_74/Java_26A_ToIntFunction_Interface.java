package java_10_miscellaneous_74;

import java.util.function.ToIntFunction;

public class Java_26A_ToIntFunction_Interface {

	public static void main(String args[]) {

		// Instantiating ToIntFunction
		ToIntFunction<Double> ob = a -> (int) (a * 10);

		// Applying the above function
		// using applyAsInt()
		System.out.println(ob.applyAsInt(3.2));
	}
}
