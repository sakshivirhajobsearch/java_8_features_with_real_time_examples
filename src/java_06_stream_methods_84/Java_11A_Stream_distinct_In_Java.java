package java_06_stream_methods_84;

//Implementation of Stream.distinct()
//to get the distinct elements in the List
import java.util.Arrays;
import java.util.List;

public class Java_11A_Stream_distinct_In_Java {

	public static void main(String[] args) {

		// Creating a list of integers
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);

		System.out.println("The distinct elements are :");

		// Displaying the distinct elements in the list
		// using Stream.distinct() method
		list.stream().distinct().forEach(System.out::println);
	}
}