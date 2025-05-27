package java_10_miscellaneous_74;

import java.util.function.LongUnaryOperator;

public class Java_08E_LongUnaryOperator_Interface_In_Java {

	public static void main(String args[]) {

		LongUnaryOperator op = a -> a / 3;
		op = op.compose(a -> a * 6);
		System.out.println(op.applyAsLong(12));
	}
}
