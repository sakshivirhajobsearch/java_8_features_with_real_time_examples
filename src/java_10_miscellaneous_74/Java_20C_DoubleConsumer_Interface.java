package java_10_miscellaneous_74;

import java.util.function.DoubleConsumer;

public class Java_20C_DoubleConsumer_Interface {

	public static void main(String args[]) {

		// Create a DoubleConsumer Instance
		DoubleConsumer mul = a -> a /= 10;

		try {
			// using addThen() method
			DoubleConsumer composite = mul.andThen(null);
			composite.accept(3);
			
		} catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}
}