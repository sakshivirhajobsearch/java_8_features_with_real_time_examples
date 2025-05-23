package java_06_stream_methods_84;

//Implementation of Stream.sorted()
//to get a stream of sorted elements
//according to the provided Comparator
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java_09B_Stream_sorted_Comparator_comparator_Method_In_Java {

	public static void main(String[] args) {

		// Creating a list of Strings
		List<String> list = Arrays.asList("Geeks", "for", "GeeksforGeeks", "GeeksQuiz", "GFG");

		System.out.println("The sorted stream according " + "to provided Comparator is : ");

		// Displaying the list of Strings in
		// reverse order after sorting
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}