package java_10_miscellaneous_74;

import java.util.function.UnaryOperator;

public class Java_11A_UnaryOperator_Interface_In_Java {

	public static void main(String args[]) {

		// Instantiate the UnaryOperator interface
		UnaryOperator<Boolean> op = UnaryOperator.identity();

		// Apply identify() method
		System.out.println(op.apply(true));
	}
}