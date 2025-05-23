package java_06_stream_methods_84;

import java.util.stream.Stream;

public class Java_28A_Stream_empty {

	public static void main(String[] args) {
		
		// Creating an empty Stream
		Stream<String> stream = Stream.empty();

		// Displaying elements in Stream
		stream.forEach(System.out::println);
	}
}
