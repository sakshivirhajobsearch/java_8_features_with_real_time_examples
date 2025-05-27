package java_10_miscellaneous_74;

import java.util.function.LongConsumer;

public class Java_19D_LongConsumer_Interface {

	public static void main(String args[]) {

		try {
			LongConsumer divide = a -> a = a / (a - 3);
			LongConsumer mul = a -> a *= 10;
			LongConsumer composite = mul.andThen(divide);
			composite.accept(3);
			
		} catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}
}