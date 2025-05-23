package java_04_streams_76;

//Java program to demonstrate return type
//of Arrays.stream() and Stream.of() method
//for primitive arrays
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java_17C_Difference_Between_Stream_Of_And_Arrays_Stream_Method_In_Java {

	public static void main(String[] args) {
		
		// Creating an integer array
		int arr[] = { 1, 2, 3, 4, 5 };

		// --------- Using Arrays.stream() ---------

		// to convert int array into Stream
		IntStream intStream = Arrays.stream(arr);

		// Displaying elements in Stream
		intStream.forEach(str -> System.out.print(str + " "));

		// --------- Using Stream.of() ---------

		// to convert int array into Stream
		Stream<int[]> stream = Stream.of(arr);

		// Displaying elements in Stream
		stream.forEach(str -> System.out.print(str + " "));
	}
}