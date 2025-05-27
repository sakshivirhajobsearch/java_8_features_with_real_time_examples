package java_10_miscellaneous_74;

import java.util.function.ToLongBiFunction;

public class Java_30A_ToLongBiFunction_Interface {

	public static void main(String args[]) {
		
		ToLongBiFunction<Integer, String> ob = (a, b) -> a + Integer.parseInt(b) * 1000000;

		// Using applyAsLong() method
		System.out.println(ob.applyAsLong(3, "10"));
	}
}