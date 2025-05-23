package java_06_stream_methods_84;

// Java program to demonstrate
// Stream.iterate method

import java.util.stream.Stream;

public class Java_17A_Stream_iterate_T_Predicate_UnaryOperator_Method {

	public static void main(String[] args) {

		// create a stream using iterate
		Stream<Integer> stream = Stream.iterate(1, i -> i <= 20, i -> i * 2);

		// print Values
		stream.forEach(System.out::println);
	}
}
