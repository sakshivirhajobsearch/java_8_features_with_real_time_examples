package java_06_stream_methods_84;

//Implementation of Stream.sorted()
//to get a stream of elements
//sorted in their natural order
import java.util.Arrays;
import java.util.List;

public class Java_10A_Stream_sorted_In_Java {

	public static void main(String[] args) {

		// Creating a list of integers
		List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

		System.out.println("The sorted stream is : ");

		// displaying the stream with elements
		// sorted in natural order
		list.stream().sorted().forEach(System.out::println);
	}
}
