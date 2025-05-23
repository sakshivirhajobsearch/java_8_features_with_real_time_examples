package java_06_stream_methods_84;

import java.util.stream.Stream;

public class Java_22A_Stream_Builder_accept_Method_In_Java {

	public static void main(String[] args) {
		
		// Using Stream builder()
		Stream.Builder<String> builder = Stream.builder();

		// Adding elements in the stream of Strings
		Stream<String> stream = builder.add("Geeks").build();

		// Displaying the elements in the stream
		stream.forEach(System.out::println);
	}
}