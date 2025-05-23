package java_06_stream_methods_84;

//Java Program to Get Stream Consisting of Elements
//of Stream that Matches Given Predicate
//for Stream Filter (Predicate predicate)

//Importing required classes
import java.util.stream.Stream;

//Class
public class Java_08B_Stream_filter {

	public static void main(String[] args) {
		
		// Creating a stream of strings
		Stream<String> stream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");

		// Getting a stream consisting of the
		// elements having UpperCase Character
		// at custom index say be it '1'
		// using Stream filter(Predicate predicate)
		stream.filter(str -> Character.isUpperCase(str.charAt(1))).forEach(System.out::println);
	}
}
