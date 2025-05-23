package java_06_stream_methods_84;

import java.util.stream.Stream;

public class Java_04A_Stream_Of_Method_In_Java {

	public static void main(String[] args) {
		
		// Creating an Stream having single element only
		Stream stream = Stream.of("Geeks");

		// Displaying the Stream having single element
		stream.forEach(System.out::println);
	}
}