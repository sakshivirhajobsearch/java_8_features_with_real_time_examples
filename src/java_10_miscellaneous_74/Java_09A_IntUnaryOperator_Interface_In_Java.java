package java_10_miscellaneous_74;

import java.util.function.IntUnaryOperator;

public class Java_09A_IntUnaryOperator_Interface_In_Java {
	
	public static void main(String args[]) {
		
		IntUnaryOperator op = IntUnaryOperator.identity();
		System.out.println(op.applyAsInt(12));
	}
}