package java_10_miscellaneous_74;

import java.util.function.IntUnaryOperator;

public class Java_09F_IntUnaryOperator_Interface_In_Java {
	
	public static void main(String args[]) {
		
		IntUnaryOperator op = a -> a / 3;
		op = op.compose(null);
		System.out.println(op.applyAsInt(12));
	}
}