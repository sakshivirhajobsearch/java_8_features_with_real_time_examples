package java_06_stream_methods_84;

import java.util.stream.LongStream;

public class Java_29B_LongStream_flatMap_LongFunction_mapper_In_Java {

	public static void main(String[] args) {
		
		// Creating an LongStream
		LongStream stream1 = LongStream.of(49L, 64L, 81L, 100L);

		// Using LongStream flatMap()
		LongStream stream2 = stream1.flatMap(num -> LongStream.of(Long.bitCount(num)));

		// Displaying the resulting LongStream
		stream2.forEach(System.out::println);
	}
}