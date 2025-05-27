package java_10_miscellaneous_74;

import java.util.function.DoubleUnaryOperator;

public class Java_10E_DoubleUnaryOperator_Interface_In_Java {

	public static void main(String args[]) {

		DoubleUnaryOperator op = a -> a / 3;
		op = op.compose(a -> a * 6);
		System.out.println(op.applyAsDouble(12.0));
	}
}