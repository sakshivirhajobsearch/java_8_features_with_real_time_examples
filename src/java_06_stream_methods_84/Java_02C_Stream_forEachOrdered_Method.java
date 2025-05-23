package java_06_stream_methods_84;

import java.util.stream.Stream;

public class Java_02C_Stream_forEachOrdered_Method {

	public static void main(String[] args) {

		// Creating a Stream of Strings
		Stream<String> stream = Stream.of("GFG", "Geeks", "for", "GeeksforGeeks");

		// Using forEachOrdered(Consumer action)
		stream.flatMap(str -> Stream.of(str.charAt(2))).forEachOrdered(System.out::println);

	}
}
