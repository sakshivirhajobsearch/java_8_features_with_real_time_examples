package java_05_stream_programs_57;

//Java Program to convert
//Set to Stream in Java 8
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

class Java_04A_Program_To_Convert_A_Set_To_Stream_In_Java_Using_Generics {

	// Generic function to convert a set to stream
	private static <T> Stream<T> convertSetToStream(Set<T> set) {
		return set.stream();
	}

	// Main method
	public static void main(String args[]) {
		// Create a set of String
		Set<Integer> setOfInteger = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10));

		// Print the set of Integer
		System.out.println("Set of Integer: " + setOfInteger);

		// Convert Set of Stream
		Stream<Integer> streamOfInteger = convertSetToStream(setOfInteger);

		// Print the Stream of Integer
		System.out.println("Stream of Integer: " + Arrays.toString(streamOfInteger.toArray()));
	}
}