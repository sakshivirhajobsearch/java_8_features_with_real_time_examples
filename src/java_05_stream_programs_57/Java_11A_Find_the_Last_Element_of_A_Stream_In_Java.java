package java_05_stream_programs_57;

import java.util.stream.Stream;

public class Java_11A_Find_the_Last_Element_of_A_Stream_In_Java {

	// Function to find the
	// last_elements in a Stream
	public static <T> T lastElementInStream(Stream<T> stream) {
		T last_element = stream

				// reduce() method reduces the Stream
				// to a single element, which is last.
				.reduce((first, second) -> second)

				// if stream is empty
				// null is returned
				.orElse(null);

		return last_element;
	}

	// Driver code
	public static void main(String[] args) {

		Stream<String> stream = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");

		// Print the last element of a Stream
		System.out.println("Last Element: " + lastElementInStream(stream));
	}
}