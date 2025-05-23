package java_06_stream_methods_84;

import java.util.stream.LongStream;

public class Java_30A_LongStream_filter {

	public static void main(String[] args) {
		
		// Creating an LongStream
		LongStream stream = LongStream.of(3L, 5L, 6L, 8L, 9L);

		// Using LongStream filter(LongPredicate predicate)
		// to get a stream consisting of the
		// elements that gives remainder 2 when
		// divided by 3
		stream.filter(num -> num % 3 == 2).forEach(System.out::println);
	}
}