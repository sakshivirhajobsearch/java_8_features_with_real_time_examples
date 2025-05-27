package java_10_miscellaneous_74;

import java.util.function.LongUnaryOperator;

public class Java_08D_LongUnaryOperator_Interface_In_Java {

	public static void main(String args[]) {

		try {

			LongUnaryOperator op = a -> 2 * a;
			op = op.andThen(null);
			System.out.println(op.applyAsLong(12));
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}
