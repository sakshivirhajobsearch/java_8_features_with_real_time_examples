package java_05_stream_programs_57;

import java.util.stream.Stream;

public class Java_10B_Find_the_First_Element_of_A_Stream_In_Java {

	// Function to find the
	// first_elements in a Stream
	public static <T> T firstElementInStream(Stream<T> stream) {
		T first_element = stream

				// findFirst() method returns
				// the first element of stream
				.findFirst()

				// if stream is empty
				// null is returned
				.orElse(null);

		return first_element;
	}

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");

		// Print the first element of a Stream
		System.out.println("First Element: " + firstElementInStream(stream));
	}
}
