package java_05_stream_programs_57;

//Java program to iterate over Stream with Indices

import java.util.stream.IntStream;

public class Java_18A_Program_To_Iterate_over_A_Stream_With_Indices_In_Java_8 {

	public static void main(String[] args) {

		String[] array = { "G", "e", "e", "k", "s" };

		// Iterate over the Stream with indices
		IntStream

				// Get the Stream from the array
				.range(0, array.length)

				// Map each elements of the stream
				// with an index associated with it
				.mapToObj(index -> String.format("%d -> %s", index, array[index]))

				// Print the elements with indices
				.forEach(System.out::println);
	}
}