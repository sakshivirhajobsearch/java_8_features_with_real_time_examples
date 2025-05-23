package java_05_stream_programs_57;

//Java Program to convert
//Stream to array in Java 8
import java.util.Arrays;
import java.util.stream.Stream;

public class Java_06C_Program_To_Convert_Stream_To_an_Array_In_Java {

	// Function to convert Stream to Array
	public static int[] convertStreamToArray(Stream<Integer> stream) {
		return stream.mapToInt(Integer::intValue).toArray();
	}

	public static void main(String args[]) {

		// Create a stream of integers
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

		// Convert Stream to array
		int[] array = convertStreamToArray(stream);

		// Print the array of stream
		System.out.println("Array of Integer from Stream: " + Arrays.toString(array));
	}
}
