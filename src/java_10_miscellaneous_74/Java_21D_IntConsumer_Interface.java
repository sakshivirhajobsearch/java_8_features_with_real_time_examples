package java_10_miscellaneous_74;

import java.util.function.IntConsumer;

public class Java_21D_IntConsumer_Interface {

	public static void main(String args[]) {

		try {
			// Create a IntConsumer Instance
			IntConsumer divide = a -> a = a / (a - 3);
			IntConsumer mul = a -> a *= 10;
			IntConsumer composite = mul.andThen(divide);
			composite.accept(3);
			
		} catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}
}