package java_06_stream_methods_84;

//Java code to show the implementation
//of IntStream.Builder add(T t)

import java.util.stream.IntStream;

public class Java_23B_IntStream_Builder_add_Method_In_Java {

	public static void main(String[] args) {

		// Declaring an empty Stream
		IntStream.Builder b = IntStream.builder();

		// using IntStream.Builder add(T t)
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);

		// Creating the Stream
		// The stream has now entered the built phase
		// printing the elements
		System.out.println("Stream successfully built");
		b.build().forEach(System.out::println);

		// Trying to add another element into the stream
		// Since the Stream is in built phase
		// This operation is not possible now
		// Hence add() will throw exception now

		try {
			b.add(50);
		} catch (Exception e) {
			System.out.println("Exception thrown " + "when now adding element into the stream: " + e);
		}
	}
}