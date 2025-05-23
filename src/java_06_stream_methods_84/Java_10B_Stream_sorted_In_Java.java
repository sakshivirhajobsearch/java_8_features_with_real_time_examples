package java_06_stream_methods_84;

//Implementation of Stream.sorted()
//to get a stream of elements
//sorted in their natural order
import java.util.Arrays;
import java.util.List;

public class Java_10B_Stream_sorted_In_Java {

	public static void main(String[] args) {

		// Creating a list of strings
		List<String> list = Arrays.asList("Geeks", "for", "GeeksQuiz", "GeeksforGeeks", "GFG");

		System.out.println("The sorted stream is : ");

		// displaying the stream with elements
		// sorted in their natural order
		list.stream().sorted().forEach(System.out::println);
	}
}