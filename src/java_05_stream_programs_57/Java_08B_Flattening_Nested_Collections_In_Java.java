package java_05_stream_programs_57;

//Importing Arrays and Stream classes 
//from java.util package
import java.util.Arrays;
import java.util.stream.Stream;

//Main class
class Java_08B_Flattening_Nested_Collections_In_Java {

	// Method 1
	// To flatten a stream of two arrays of the same type
	public static <T> Stream<T> flatten(T[] a, T[] b) {
		// Stream.flatMap() method converts
		// Stream<Collection<T>> to the Stream<T>
		Stream<T> stream = Stream.of(a, b).flatMap(Arrays::stream);

		// Returns the desired stream
		return stream;
	}

	// Method 2
	// Main driver method
	public static void main(String[] args) {
		// Input array of strings

		// Array 1 has uppercase characters
		String[] a = { "A", "B", "C" };

		// Array 2 has lowercase characters
		String[] b = { "i", "J", "K" };

		// Calling the above method in the main() method
		String[] s = flatten(a, b).toArray(String[]::new);

		// Return string representation of contents
		// of integer array
		System.out.println(Arrays.toString(s));
	}
}
