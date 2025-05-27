package java_10_miscellaneous_74;

import java.util.function.ToIntBiFunction;

public class Java_31A_ToIntBiFunction_Interface {

	public static void main(String args[]) {

		ToIntBiFunction<Integer, String> ob = (a, b) -> a + Integer.parseInt(b) * 3;

		// Using applyAsInt() method
		System.out.println(ob.applyAsInt(3, "10"));
	}
}