package java_04_streams_76;

import java.util.stream.Stream;

public class Java_17B_Difference_Between_Stream_Of_And_Arrays_Stream_Method_In_Java {

	// Driver code
	public static void main(String[] args) {
		// Creating an Stream
		Stream stream = Stream.of("Geeks", "for", "Geeks");

		// Displaying the sequential ordered stream
		stream.forEach(str -> System.out.print(str + " "));
	}
}