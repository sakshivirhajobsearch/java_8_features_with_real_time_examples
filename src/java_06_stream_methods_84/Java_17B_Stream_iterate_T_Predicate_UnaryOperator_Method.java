package java_06_stream_methods_84;

// Java program to demonstrate
// Stream.iterate method

import java.util.stream.Stream;

public class Java_17B_Stream_iterate_T_Predicate_UnaryOperator_Method {

	public static void main(String[] args) {

		// create a stream using iterate
		Stream<Double> stream = Stream.iterate(2.0, decimal -> decimal > 0.25, decimal -> decimal / 2);

		// print Values
		stream.forEach(System.out::println);
	}
}
