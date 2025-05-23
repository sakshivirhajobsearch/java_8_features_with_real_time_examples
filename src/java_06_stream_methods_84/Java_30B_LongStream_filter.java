package java_06_stream_methods_84;

import java.util.stream.LongStream;

public class Java_30B_LongStream_filter {

	public static void main(String[] args) {
		
		// Creating an LongStream
		LongStream stream = LongStream.of(-2L, -1L, 0L, 1L, 2L);

		// Using LongStream filter(LongPredicate predicate)
		// to get a stream consisting of the
		// elements that are greater than 0
		stream.filter(num -> num > 0).forEach(System.out::println);
	}
}