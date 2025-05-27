package java_10_miscellaneous_74;

import java.util.function.DoubleConsumer;

public class Java_20B_DoubleConsumer_Interface {

	public static void main(String args[]) {

		// Create a DoubleConsumer Instance
		DoubleConsumer display = a -> System.out.println(a * 10);
		DoubleConsumer mul = a -> a /= 2;

		// using addThen() method
		DoubleConsumer composite = mul.andThen(display);
		composite.accept(3);
	}
}
