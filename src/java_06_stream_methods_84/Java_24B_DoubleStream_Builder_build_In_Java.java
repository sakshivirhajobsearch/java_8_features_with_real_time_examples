package java_06_stream_methods_84;

//Java code to show the implementation
//of DoubleStream.Builder build()

import java.util.stream.DoubleStream;

public class Java_24B_DoubleStream_Builder_build_In_Java {

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
		// Now no more elements can be added to this stream
		b.build().forEach(System.out::println);

		// Trying to add more elements in built phase
		// This will cause exception
		try {
			b.add(50.547);
		} catch (Exception e) {
			System.out.println("\nException: " + e);
		}
	}
}
