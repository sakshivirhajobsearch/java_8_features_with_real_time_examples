package java_04_streams_76;

import java.util.stream.Stream;

public class Java_10H_10_Ways_To_Create_A_Stream_In_Java {

	// Function convert a List into Stream
	private static <T> void getStream(int limitTerms) {

		// Create infinite stream
		// using Stream.generate() method
		Stream.generate(Math::random).limit(limitTerms).forEach(System.out::println);
	}

	public static void main(String[] args) {

		// Get the limit for number of terms
		int limitTerms = 5;

		// Get the Stream from the function
		getStream(limitTerms);
	}
}