package java_04_streams_76;

//Importing all classes from
//java.util package
import java.util.Arrays;

//Class
public class Java_06D_Functional_Programming_In_Java_8_Using_the_Stream_API_With_Example {

	public static void main(String[] args) {
		// Data source
		// Custom integer inputs
		Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		// Stream
		var streamOfNumbers = Arrays.stream(numbers);

		// Using filter method
		var evenNumbersStream = streamOfNumbers.filter(number -> number % 3 == 0).count();

		// Print and display
		System.out.println(evenNumbersStream);
	}
}