package java_05_stream_programs_57;

import java.util.Random;
import java.util.stream.DoubleStream;

public class Java_16C_Generate_Infinite_Stream_of_Double_In_Java {

	public static void main(String[] args) {

		// Create a Random object
		Random random = new Random();

		DoubleStream

				// Generate the next double
				// using DoubleStream.generate()
				// and Random.nextDouble()
				.generate(random::nextDouble)

				// Print the DoubleStream
				// using forEach() method.
				.forEach(System.out::println);
	}
}