package java_06_stream_methods_84;

import java.util.stream.Stream;

public class Java_27A_Stream_builder {

	public static void main(String[] args) {
		
		// Using Stream builder()
		Stream.Builder<String> builder = Stream.builder();

		// Adding elements in the stream of Strings
		Stream<String> stream = builder.add("Geeks").build();

		// Displaying the elements in the stream
		stream.forEach(System.out::println);
	}
}