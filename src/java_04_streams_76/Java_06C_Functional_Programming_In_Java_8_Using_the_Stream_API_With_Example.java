package java_04_streams_76;

import java.util.Arrays;
import java.util.stream.Stream;

public class Java_06C_Functional_Programming_In_Java_8_Using_the_Stream_API_With_Example {

	public static void main(String[] args) {
		// Data Source
		Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		// Stream
		Stream<Integer> streamOfNumbers = Arrays.stream(numbers);

		// filter all the even numbers
		Stream<Integer> evenNumbersStream = streamOfNumbers.filter(number -> number % 2 == 0);
	}
}