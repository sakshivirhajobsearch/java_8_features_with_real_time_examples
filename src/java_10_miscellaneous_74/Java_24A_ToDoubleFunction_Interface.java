package java_10_miscellaneous_74;

import java.util.function.ToDoubleFunction;

public class Java_24A_ToDoubleFunction_Interface {

	public static void main(String args[]) {
		
		ToDoubleFunction<Integer> ob = a -> a / 2;

		// using applyAsDouble()
		System.out.println(ob.applyAsDouble(3));
	}
}
