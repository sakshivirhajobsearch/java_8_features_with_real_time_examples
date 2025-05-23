package java_06_stream_methods_84;

import java.util.stream.Stream;

public class Java_12B_Stream_concat_In_Java {

	public static void main(String[] args) {

		// Creating more than two Streams
		Stream<String> stream1 = Stream.of("Geeks");
		Stream<String> stream2 = Stream.of("GeeksQuiz");
		Stream<String> stream3 = Stream.of("GeeksforGeeks");
		Stream<String> stream4 = Stream.of("GFG");

		// concatenating all the Streams
		// with Stream.concat() function
		// and displaying the result
		Stream.concat(Stream.concat(Stream.concat(stream1, stream2), stream3), stream4)
				.forEach(element -> System.out.println(element));
	}
}
