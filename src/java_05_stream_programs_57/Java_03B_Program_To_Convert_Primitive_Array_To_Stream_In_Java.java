package java_05_stream_programs_57;

//Java Program to convert
//Array to Stream
import java.util.Arrays;
import java.util.stream.IntStream;

class Java_03B_Program_To_Convert_Primitive_Array_To_Stream_In_Java {

	// Generic function to convert
	// an Array to Stream
	public static IntStream convertArrayToStream(int array[]) {

		// Return the converted Stream
		return IntStream.of(array);
	}

	public static void main(String args[]) {
		// Create an Array
		int[] array = new int[] { 3, 2, 5, 4, 1 };

		// Print the Array
		System.out.println("Array: " + Arrays.toString(array));

		// convert the Array to Stream
		IntStream stream = convertArrayToStream(array);

		// Print the Stream
		System.out.println("Stream: " + Arrays.toString(stream.toArray()));
	}
}
