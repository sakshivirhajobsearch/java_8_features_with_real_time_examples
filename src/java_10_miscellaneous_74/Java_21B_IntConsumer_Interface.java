package java_10_miscellaneous_74;

import java.util.function.IntConsumer;

public class Java_21B_IntConsumer_Interface {

	public static void main(String args[]) {

		// Create a IntConsumer Instance
		IntConsumer display = a -> System.out.println(a * 10);
		IntConsumer mul = a -> a *= 10;

		// Using andThen() method
		IntConsumer composite = mul.andThen(display);
		composite.accept(3);
	}
}