package java_10_miscellaneous_74;

import java.util.function.IntConsumer;

public class Java_21C_IntConsumer_Interface {

	public static void main(String args[]) {

		try {

			// Create a IntConsumer Instance
			IntConsumer mul = a -> a *= 10;
			IntConsumer composite = mul.andThen(null);
			composite.accept(3);
			
		} catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}
}