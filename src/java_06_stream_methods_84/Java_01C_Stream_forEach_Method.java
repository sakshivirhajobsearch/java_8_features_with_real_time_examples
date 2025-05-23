package java_06_stream_methods_84;

//Java code for forEach
//(Consumer action) in Java 8
import java.util.Comparator;
import java.util.stream.Stream;

public class Java_01C_Stream_forEach_Method {

	public static void main(String[] args) {

		// Creating a Stream of Strings
		Stream<String> stream = Stream.of("GFG", "Geeks", "for", "GeeksforGeeks");

		// Using forEach(Consumer action) to print
		// Character at index 1 in reverse order
		stream.sorted(Comparator.reverseOrder()).flatMap(str -> Stream.of(str.charAt(1))).forEach(System.out::println);
	}
}