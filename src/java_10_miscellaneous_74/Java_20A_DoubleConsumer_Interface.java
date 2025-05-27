package java_10_miscellaneous_74;

import java.util.function.DoubleConsumer;

public class Java_20A_DoubleConsumer_Interface {

	public static void main(String args[]) {

		// Create a DoubleConsumer Instance
		DoubleConsumer display = a -> System.out.println(a * 10);

		// using accept() method
		display.accept(3);
	}
}