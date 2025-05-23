package java_06_stream_methods_84;

import java.util.stream.Stream;

public class Java_12A_Stream_concat_In_Java {

	public static void main(String[] args) {
		
		// Creating two Streams
		Stream<String> stream1 = Stream.of("Geeks", "for");
		Stream<String> stream2 = Stream.of("GeeksQuiz", "GeeksforGeeks");

		// concatenating both the Streams
		// with Stream.concat() function
		// and displaying the result
		Stream.concat(stream1, stream2).forEach(element -> System.out.println(element));
	}
}
