package java_05_stream_programs_57;

//Java Program to convert
//Array to Stream
import java.util.Arrays;
import java.util.stream.Stream;

class Java_02C_Program_To_Convert_Boxed_Array_To_Stream_In_Java {

	// Generic function to convert
	// an Array to Stream
	public static <T> Stream<T> convertArrayToStream(T array[]) {

		// Return the converted Stream
		return Arrays.asList(array).stream();
	}

	public static void main(String args[]) {
		// Create an Array
		String array[] = { "Geeks", "forGeeks", "A Computer Portal" };

		// Print the Array
		System.out.println("Array: " + Arrays.toString(array));

		// convert the Array to Stream
		Stream<String> stream = convertArrayToStream(array);

		// Print the Stream
		System.out.println("Stream: " + Arrays.toString(stream.toArray()));
	}
}