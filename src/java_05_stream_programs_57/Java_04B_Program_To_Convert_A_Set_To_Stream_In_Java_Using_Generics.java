package java_05_stream_programs_57;

//Java Program to convert
//Set to Stream in Java 8
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Java_04B_Program_To_Convert_A_Set_To_Stream_In_Java_Using_Generics {

	// Generic function to convert a set to stream
	private static <T> Stream<T> convertSetToStream(Set<T> set, Predicate<T> predicate) {
		return set.stream().filter(predicate);
	}

	public static void main(String args[]) {
		
		// Create a set of String
		Set<String> setOfString = new HashSet<>(Arrays.asList("GeeksForGeeks", "A computer portal", "for", "Geeks"));

		// Print the set of String
		System.out.println("Set of String: " + setOfString);

		// Create the predicate for item starting with G
		Predicate<String> predicate = new Predicate<String>() {
			@Override
			public boolean test(String s) {
				// filter items that start with "G"
				return s.startsWith("G");
			}
		};

		// Convert Set of Stream
		Stream<String> streamOfString = convertSetToStream(setOfString, predicate);

		// Print the filter Stream of String
		System.out.println("Stream from List with items" + " starting with G: ");

		System.out.println(Arrays.toString(streamOfString.toArray()));
	}
}
