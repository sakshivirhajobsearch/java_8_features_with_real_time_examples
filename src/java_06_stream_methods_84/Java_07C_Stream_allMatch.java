package java_06_stream_methods_84;

//Java code for Stream allMatch
//(Predicate predicate) to check whether 
//all elements of this stream match 
//the provided predicate.
import java.util.stream.Stream;

public class Java_07C_Stream_allMatch {

	public static void main(String[] args) {

		// Creating a Stream of Strings
		Stream<String> stream = Stream.of("Geeks", "for", "GeeksQuiz", "GeeksforGeeks");

		// Check if Character at 1st index is
		// UpperCase in all strings or not using
		// Stream allMatch(Predicate predicate)
		boolean answer = stream.allMatch(str -> Character.isUpperCase(str.charAt(1)));

		// Displaying the result
		System.out.println(answer);
	}
}