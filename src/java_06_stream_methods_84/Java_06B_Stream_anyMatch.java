package java_06_stream_methods_84;

//Java code for  Stream anyMatch
//(Predicate predicate) to check whether
//any element of this stream match
//the provided predicate.
import java.util.stream.Stream;

public class Java_06B_Stream_anyMatch {

	public static void main(String[] args) {

		// Creating a Stream of Strings
		Stream<String> stream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");

		// Check if Character at 1st index is
		// UpperCase in any string or not using
		// Stream anyMatch(Predicate predicate)
		boolean answer = stream.anyMatch(str -> Character.isUpperCase(str.charAt(1)));

		// Displaying the result
		System.out.println(answer);
	}
}