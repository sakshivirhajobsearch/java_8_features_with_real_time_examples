package java_10_miscellaneous_74;

import java.util.function.LongToDoubleFunction;

public class Java_29A_LongToDoubleFunction_Interface {

	public static void main(String args[]) {

		LongToDoubleFunction ob = a -> a / 2;

		// Using applyAsDouble() method
		System.out.println(ob.applyAsDouble(3));
	}
}
