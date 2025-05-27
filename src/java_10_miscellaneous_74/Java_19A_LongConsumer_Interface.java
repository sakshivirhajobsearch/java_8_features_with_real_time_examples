package java_10_miscellaneous_74;

import java.util.function.LongConsumer;

public class Java_19A_LongConsumer_Interface {

	public static void main(String args[]) {

		// Create a LongConsumer Instance
		LongConsumer display = a -> System.out.println(a * 100);

		// Using accept() method
		display.accept(3);
	}
}
