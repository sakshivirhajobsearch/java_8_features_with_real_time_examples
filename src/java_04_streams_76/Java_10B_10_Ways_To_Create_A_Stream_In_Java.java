package java_04_streams_76;

import java.util.stream.Stream;

public class Java_10B_10_Ways_To_Create_A_Stream_In_Java {

	// Function convert a List into Stream
	private static void getStream() {

		// Create a stream from specified values
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// Displaying the sequential ordered stream
		stream.forEach(p -> System.out.print(p + " "));
	}

	public static void main(String[] args) {

		// Get the Stream from the values
		getStream();
	}
}
