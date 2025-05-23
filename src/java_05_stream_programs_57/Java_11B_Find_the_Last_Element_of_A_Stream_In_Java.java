package java_05_stream_programs_57;

import java.util.stream.Stream;

public class Java_11B_Find_the_Last_Element_of_A_Stream_In_Java {

	// Function to find the
	// last_elements in a Stream
	public static <T> T lastElementInStream(Stream<T> stream, int N) {

		T last_element = stream

				// This returns a stream after
				// removing first N-1 elements
				// resultant stream will contain
				// only single element
				.skip(N - 1)

				// findFirst() method return
				// the first element of
				// newly generated stream
				.findFirst()

				// if stream is empty
				// null is returned
				.orElse(null);

		return last_element;
	}

	// Driver code
	public static void main(String[] args) {

		Stream<String> stream = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");

		int N = 5;

		// Print the last element of a Stream
		System.out.println("Last Element: " + lastElementInStream(stream, N));
	}
}