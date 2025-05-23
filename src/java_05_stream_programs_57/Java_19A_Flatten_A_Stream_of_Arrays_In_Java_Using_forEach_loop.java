package java_05_stream_programs_57;

//Java program to flatten a stream of arrays
//using forEach() method

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java_19A_Flatten_A_Stream_of_Arrays_In_Java_Using_forEach_loop {

	// Function to flatten a Stream of Arrays
	public static <T> Stream<T> flattenStream(T[][] arrays) {

		// Create an empty list to collect the stream
		List<T> list = new ArrayList<>();

		// Using forEach loop
		// convert the array into stream
		// and add the stream into list
		for (T[] array : arrays) {
			Arrays.stream(array).forEach(list::add);
		}

		// Convert the list into Stream and return it
		return list.stream();
	}

	public static void main(String[] args) {

		// Get the arrays to be flattened.
		Integer[][] arr = { { 1, 2 }, { 3, 4, 5, 6 }, { 7, 8, 9 } };

		// Flatten the Stream
		Integer[] flatArray = flattenStream(arr).toArray(Integer[]::new);

		// Print the flattened array
		System.out.println(Arrays.toString(flatArray));
	}
}
