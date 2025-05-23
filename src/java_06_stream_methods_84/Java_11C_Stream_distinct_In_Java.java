package java_06_stream_methods_84;

//Implementation of Stream.distinct()
//to get the count of distinct elements
//in the List
import java.util.Arrays;
import java.util.List;

public class Java_11C_Stream_distinct_In_Java {

	public static void main(String[] args) {

		// Creating a list of strings
		List<String> list = Arrays.asList("Geeks", "for", "Geeks", "GeeksQuiz", "for", "GeeksforGeeks");

		// Storing the count of distinct elements
		// in the list using Stream.distinct() method
		long Count = list.stream().distinct().count();

		// Displaying the count of distinct elements
		System.out.println("The count of distinct elements is : " + Count);
	}
}
