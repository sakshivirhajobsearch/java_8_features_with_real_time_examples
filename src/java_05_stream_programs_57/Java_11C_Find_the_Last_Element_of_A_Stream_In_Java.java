package java_05_stream_programs_57;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java_11C_Find_the_Last_Element_of_A_Stream_In_Java {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		// Get the first element of the reversed stream
		Integer firstElementOfReversedStream = numbers.stream().sorted(Collections.reverseOrder()).findFirst()
				.orElse(null);
		// Handle the case where the stream might be empty
		System.out.println("First element of the reversed stream: " + firstElementOfReversedStream);
	}
}