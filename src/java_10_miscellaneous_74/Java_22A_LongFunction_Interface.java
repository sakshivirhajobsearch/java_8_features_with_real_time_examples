package java_10_miscellaneous_74;

import java.util.function.LongFunction;

public class Java_22A_LongFunction_Interface {

	public static void main(String args[]) {

		LongFunction<Double> ob = a -> a / 2.0;

		// Using apply()
		System.out.println(ob.apply(3));
	}
}