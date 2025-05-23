package java_06_stream_methods_84;

//Java Program to Get a Stream Consisting ofElements
//of Stream that Matches Given predicate
//for Stream filter (Predicate predicate)

//Importing required classes
import java.util.stream.Stream;

//Class
public class Java_08C_Stream_filter {

	public static void main(String[] args) {

		// Creating a stream of strings
		Stream<String> stream = Stream.of("Geeks", "foR", "GeEksQuiz", "GeeksforGeeks");

		// Getting a stream consisting of the
		// elements ending with 's'
		// using Stream filter(Predicate predicate)
		stream.filter(str -> str.endsWith("s")).forEach(System.out::println);
	}
}
