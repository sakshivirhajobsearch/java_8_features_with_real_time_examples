package java_06_stream_methods_84;

//Java code to show the implementation
//of IntStream.Builder add(int t)

import java.util.stream.IntStream;

public class Java_23A_IntStream_Builder_add_Method_In_Java {

	public static void main(String[] args) {

		// Declaring an empty Stream
		IntStream.Builder b = IntStream.builder();

		// Inserting elements into the stream
		// using IntStream.Builder add(int t)
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);

		// Creating the Stream
		// The stream has now entered the built phase
		// printing the elements
		System.out.println("Stream successfully built");
		b.build().forEach(System.out::println);
	}
}