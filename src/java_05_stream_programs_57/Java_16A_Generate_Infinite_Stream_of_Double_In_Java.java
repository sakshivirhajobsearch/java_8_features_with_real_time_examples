package java_05_stream_programs_57;

import java.util.stream.DoubleStream;

public class Java_16A_Generate_Infinite_Stream_of_Double_In_Java {

	// Main method
	public static void main(String[] args) {

		DoubleStream

				// Iterate the DoubleStream with i
				// by incrementing the value with 1
				.iterate(0, i -> i + 1)

				// Print the DoubleStream
				// using forEach() method.
				.forEach(System.out::println);
	}
}