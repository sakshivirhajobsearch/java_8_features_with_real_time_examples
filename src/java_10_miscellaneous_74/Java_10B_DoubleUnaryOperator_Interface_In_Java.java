package java_10_miscellaneous_74;

import java.util.function.DoubleUnaryOperator;

public class Java_10B_DoubleUnaryOperator_Interface_In_Java {

	public static void main(String args[]) {
		
		DoubleUnaryOperator op = a -> 2 * a;
		System.out.println(op.applyAsDouble(12.0));
	}
}
