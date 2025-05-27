package java_10_miscellaneous_74;

import java.util.function.DoubleUnaryOperator;

public class Java_10F_DoubleUnaryOperator_Interface_In_Java {

	public static void main(String args[]) {

		try {
			DoubleUnaryOperator op = a -> a / 3;
			op = op.compose(null);
			System.out.println(op.applyAsDouble(12.0));
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}
