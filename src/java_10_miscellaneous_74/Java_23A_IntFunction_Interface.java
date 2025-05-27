package java_10_miscellaneous_74;

import java.util.function.IntFunction;

public class Java_23A_IntFunction_Interface {

	public static void main(String args[]) {
		
		IntFunction<Double> ob = a -> a / 2.0;

		// Using apply() method
		System.out.println(ob.apply(3));
	}
}
