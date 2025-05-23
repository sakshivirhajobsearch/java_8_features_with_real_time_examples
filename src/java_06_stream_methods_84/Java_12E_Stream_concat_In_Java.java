package java_06_stream_methods_84;

import java.util.stream.LongStream;

public class Java_12E_Stream_concat_In_Java {

	public static void main(String[] args) {

		// Creating two Streams
		LongStream Stream1 = LongStream.of(1520, 1620);
		LongStream Stream2 = LongStream.of(1720, 1820);

		// concatenating both the Streams and
		// displaying the result
		LongStream.concat(Stream1, Stream2).forEach(element -> System.out.println(element));
	}
}
