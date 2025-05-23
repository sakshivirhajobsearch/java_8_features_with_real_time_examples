package java_06_stream_methods_84;

//Java code to show the implementation
//of DoubleStream.Builder build()

import java.util.stream.DoubleStream;

public class Java_24A_DoubleStream_Builder_build_In_Java {

	public static void main(String[] args) {

		// Creating a Stream in building phase
		DoubleStream.Builder b = DoubleStream.builder();

		// Adding elements into the stream
		b.add(1.2);
		b.add(2.4);
		b.add(3.87);
		b.add(4.78);

		// Constructing the built stream using build()
		// This will enter the stream in built phase
		b.build().forEach(System.out::println);
	}
}
