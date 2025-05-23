package java_06_stream_methods_84;

import java.util.stream.Stream;

public class Java_12D_Stream_concat_In_Java {

	public static void main(String[] args) {

		// Creating two Streams
		Stream<String> stream1 = Stream.of("Geeks", "for", "GeeksforGeeks");
		Stream<String> stream2 = Stream.of("GeeksQuiz", "GeeksforGeeks", "for");

		// concatenating both the Streams
		// with Stream.concat() function
		// and displaying the result after
		// removing the duplicates
		Stream.concat(stream1, stream2).distinct().forEach(element -> System.out.println(element));
	}
}
