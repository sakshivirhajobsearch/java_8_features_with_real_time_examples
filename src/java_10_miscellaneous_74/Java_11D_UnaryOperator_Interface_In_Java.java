package java_10_miscellaneous_74;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Java_11D_UnaryOperator_Interface_In_Java {

	public static void main(String args[]) {
		
		UnaryOperator<Integer> xor = a -> a ^ 1;
		UnaryOperator<Integer> and = a -> a & 1;
		Function<Integer, Integer> compose = xor.compose(and);
		System.out.println(compose.apply(231));
	}
}