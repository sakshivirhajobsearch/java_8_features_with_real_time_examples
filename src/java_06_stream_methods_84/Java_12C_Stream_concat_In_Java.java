package java_06_stream_methods_84;

import java.util.stream.DoubleStream;

public class Java_12C_Stream_concat_In_Java {

	public static void main(String[] args) {

		// Creating two Streams
		DoubleStream Stream1 = DoubleStream.of(1520, 1620);
		DoubleStream Stream2 = DoubleStream.of(1720, 1820);

		// concatenating both the Streams and
		// displaying the result
		DoubleStream.concat(Stream1, Stream2).forEach(element -> System.out.println(element));
	}
}
