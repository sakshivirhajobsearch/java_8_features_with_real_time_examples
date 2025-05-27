package java_10_miscellaneous_74;

import java.util.function.UnaryOperator;

public class Java_11B_UnaryOperator_Interface_In_Java {

	public static void main(String args[]) {
		
		UnaryOperator<Integer> xor = a -> a ^ 1;
		System.out.println(xor.apply(2));
	}
}
