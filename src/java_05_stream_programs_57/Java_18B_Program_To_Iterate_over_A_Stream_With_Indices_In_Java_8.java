package java_05_stream_programs_57;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Java_18B_Program_To_Iterate_over_A_Stream_With_Indices_In_Java_8 {

	public static void main(String[] args) {

		String[] array = { "G", "e", "e", "k", "s" };

		// Create an AtomicInteger for index
		AtomicInteger index = new AtomicInteger();

		// Iterate over the Stream with indices
		Arrays

				// Get the Stream from the array
				.stream(array)

				// Map each elements of the stream
				// with an index associated with it
				.map(str -> index.getAndIncrement() + " -> " + str)

				// Print the elements with indices
				.forEach(System.out::println);
	}
}
