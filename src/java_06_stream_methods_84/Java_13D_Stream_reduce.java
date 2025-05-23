package java_06_stream_methods_84;

import java.util.stream.IntStream;

public class Java_13D_Stream_reduce {
	
	public static void main(String[] args) {
		
		// Calculating the product of all numbers in the range [2, 8)
		int product = IntStream.range(2, 8).reduce((num1, num2) -> num1 * num2).orElse(-1); // Provides -1 if the stream
																							// is empty

		// Displaying the product
		System.out.println("The product is : " + product);
	}
}