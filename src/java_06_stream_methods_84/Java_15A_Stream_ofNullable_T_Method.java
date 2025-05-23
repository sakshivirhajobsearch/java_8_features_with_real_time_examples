package java_06_stream_methods_84;

//Java program to demonstrate
//Stream.ofNullable() method

import java.util.stream.Stream;

public class Java_15A_Stream_ofNullable_T_Method {

	public static void main(String[] args) {

		// Create a stream with null
		Stream<String> value = Stream.ofNullable(null);

		// Print values
		System.out.println("Values of Stream:");
		value.forEach(System.out::println);
	}
}
