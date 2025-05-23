package java_05_stream_programs_57;

//Java program to find the duplicate
//elements in a Stream using Set
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java_12A_How_To_Find_Duplicate_Elements_In_A_Stream_In_Java {

	// Function to find the
	// duplicates in a Stream
	public static <T> Set<T> findDuplicateInStream(Stream<T> stream) {

		// Set to store the duplicate elements
		Set<T> items = new HashSet<>();

		// Return the set of duplicate elements
		return stream

				// Set.add() returns false
				// if the element was
				// already present in the set.
				// Hence filter such elements
				.filter(n -> !items.add(n))

				// Collect duplicate elements
				// in the set
				.collect(Collectors.toSet());
	}

	public static void main(String[] args) {

		// Initial stream
		Stream<Integer> stream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);

		// Print the found duplicate elements
		System.out.println(findDuplicateInStream(stream));
	}
}
