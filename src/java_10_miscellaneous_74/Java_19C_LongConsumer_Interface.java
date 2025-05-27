package java_10_miscellaneous_74;

import java.util.function.LongConsumer;

public class Java_19C_LongConsumer_Interface {

	public static void main(String args[]) {

		try {

			LongConsumer mul = a -> a *= 10;
			LongConsumer composite = mul.andThen(null);
			composite.accept(3);

		} catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}
}