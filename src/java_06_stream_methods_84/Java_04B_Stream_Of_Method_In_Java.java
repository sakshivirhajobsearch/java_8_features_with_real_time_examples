package java_06_stream_methods_84;

import java.util.stream.Stream;

public class Java_04B_Stream_Of_Method_In_Java {

	public static void main(String[] args) {
		
		// Creating an Stream
		Stream stream = Stream.of("Geeks", "for", "Geeks");

		// Displaying the sequential ordered stream
		stream.forEach(System.out::println);
	}
}