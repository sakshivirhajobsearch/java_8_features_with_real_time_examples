package java_10_miscellaneous_74;

import java.util.function.LongUnaryOperator;

public class Java_08C_LongUnaryOperator_Interface_In_Java {

	public static void main(String args[]) {

		LongUnaryOperator op = a -> 2 * a;
		op = op.andThen(a -> 3 * a);
		System.out.println(op.applyAsLong(12));
	}
}
