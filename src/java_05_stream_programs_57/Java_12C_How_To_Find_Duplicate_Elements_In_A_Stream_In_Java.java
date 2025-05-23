package java_05_stream_programs_57;

//Java program to find the duplicate
//elements in a Stream
//using Collections.frequency()
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java_12C_How_To_Find_Duplicate_Elements_In_A_Stream_In_Java {

	// Function to find the
	// duplicates in a Stream
	public static <T> Set<T> findDuplicateInStream(List<T> list) {
		// Return the set of duplicate elements
		return

		// Get the stream from the list
		list.stream()

				// Count the frequency of each element
				// and filter the elements
				// with frequency > 1
				.filter(i -> Collections.frequency(list, i) > 1)

				// And Collect them in a Set
				.collect(Collectors.toSet());
	}

	public static void main(String[] args) {

		// Initial stream
		List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);

		// Print the found duplicate elements
		System.out.println(findDuplicateInStream(list));
	}
}
