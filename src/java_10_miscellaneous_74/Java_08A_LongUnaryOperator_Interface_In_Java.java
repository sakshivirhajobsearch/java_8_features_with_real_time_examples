package java_10_miscellaneous_74;

import java.util.function.LongUnaryOperator;

public class Java_08A_LongUnaryOperator_Interface_In_Java {

	public static void main(String args[]) {

		LongUnaryOperator op = LongUnaryOperator.identity();
		System.out.println(op.applyAsLong(12));
	}
}
