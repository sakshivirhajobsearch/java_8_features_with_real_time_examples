package java_05_stream_programs_57;

import java.util.Random;

public class Java_17B_Generate_Infinite_Stream_of_Integers_In_Java {

	public static void main(String[] args) {

		// Create a Random object
		Random random = new Random();

		random

				// Get the next double
				// using doubles() method
				.doubles()

				// Print the DoubleStream
				// using forEach() method.
				.forEach(System.out::println);
	}
}