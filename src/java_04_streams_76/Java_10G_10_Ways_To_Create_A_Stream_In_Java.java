package java_04_streams_76;

import java.util.stream.Stream;

public class Java_10G_10_Ways_To_Create_A_Stream_In_Java {

	// Function convert a List into Stream
	private static <T> void getStream(int seedValue, int limitTerms) {

		// Create infinite stream
		// using Stream.iterate() method
		Stream.iterate(seedValue, (Integer n) -> n * n).limit(limitTerms).forEach(System.out::println);
	}

	public static void main(String[] args) {

		// Get the seed value
		int seedValue = 2;

		// Get the limit for number of terms
		int limitTerms = 5;

		// Get the Stream from the function
		getStream(seedValue, limitTerms);
	}
}
