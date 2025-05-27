package java_10_miscellaneous_74;

import java.util.function.IntConsumer;

public class Java_21A_IntConsumer_Interface {

	public static void main(String args[]) {

		// Create a IntConsumer Instance
		IntConsumer display = a -> System.out.println(a * 10);

		// Using accept() method
		display.accept(3);
	}
}
